/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.adminclient.servlets;

import client.MovieService;
import client.MovieService_Service;
import client.Movies;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Marina
 * Controls adding and updating movie records. Movie upload is here 
 */


@WebServlet(name = "ProcessAddMovie", urlPatterns = {"/ProcessAddMovie"})
@MultipartConfig
public class ProcessAddMovie extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
     private final MovieService_Service service= new MovieService_Service();
       private final  MovieService port = service.getMovieServicePort();
       
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String errorMessage="";
        String successMessage="";
        String name=null;
        
        if(request.getParameter("movieName")!=null){
            name =request.getParameter("movieName");
        }else{
            errorMessage="Name is required";
        }
        
        if(name!=null){
             String  type= request.getParameter("movieType");
            String series=request.getParameter("movieSeries");
            
            try{
                String releaseStr = request.getParameter("movieRelease");
                XMLGregorianCalendar release=null;
                if(releaseStr!=null&&!releaseStr.isEmpty()){
                  release = DatatypeFactory.newInstance().newXMLGregorianCalendar(releaseStr);
                }
            //getting attached file . if user provided different name, it will be saved under different name
            
             byte[] content=null; 
             String filename=null;
            

             Part part = request.getPart("filepath");    
             if(part.getSize()>0){
                filename = part.getSubmittedFileName();
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                content = new byte[(int)part.getSize()];
                part.getInputStream().read(content,0,content.length);
                bytes.write(content);
             }
            
            if(request.getParameter("movieFilename")!=null){
                filename = request.getParameter("movieFilename");
            }
        
            if(request.getParameter("add")!=null){
                //?????release date is not passed to the method upload 
               port.upload(name, type, series, release, filename, content);
               successMessage = "Movie was successfully added";
            }else{
                if(request.getParameter("movieId")!=null){
                    BigInteger movieId = new BigInteger(request.getParameter("movieId"));
              
                    //content if not going to change if file upload is empty 
                    Movies oldmovie= port.getMovie(movieId);
                    
                    if((content==null || content.length<1)&&oldmovie!=null){
                        content = oldmovie.getMovieContent();
                    }
                    
                    port.updateMovie(movieId, name, type, series, release, filename, content);
                    
                    
                    successMessage = "Movie was successfully updated";
                }else{
                    errorMessage="Error: there no movieId";
                }
                
            }
               
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                errorMessage = "There was an error: " + ex.getMessage();
            }
        } 
        
        if(errorMessage == null ||errorMessage.isEmpty()){
            //redirect back to list 
             //request.setAttribute("errorMessage", errorMessage);
             request.setAttribute("successMessage", successMessage);
             List<Movies> movieList = port.getMovieList();
             request.setAttribute("movieList",movieList); // 
             request.getRequestDispatcher("movietab.jsp").forward(request, response);   
            
        }else{
            //redirect to addForm with error message
             request.setAttribute("errorMessage", errorMessage);
             request.getRequestDispatcher("movieForm.jsp").forward(request, response);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
