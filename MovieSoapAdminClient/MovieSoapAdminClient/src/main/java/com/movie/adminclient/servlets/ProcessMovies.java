/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.adminclient.servlets;

import client.IllegalOrphanException_Exception;
import client.MovieService;
import client.MovieService_Service;
import client.Movies;
import client.NonexistentEntityException_Exception;
import com.movie.adminclient.utils.Utils;
import static com.movie.adminclient.utils.Utils.toXMLGregorianCalendar;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Marina
 */
@WebServlet(name = "ProcessMovies", urlPatterns = {"/ProcessMovies"})
public class ProcessMovies extends HttpServlet {

       private final MovieService_Service service= new MovieService_Service();
       private final  MovieService port = service.getMovieServicePort();
       private List<Movies> movieList;
       private String errorMessage;
       private String successMessage;
       

    @Override
    public void init() throws ServletException {
        super.init(); 
        //this.movieList = port.getMovieList();
        //To change body of generated methods, choose Tools | Templates.
    }
       
       
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProcessMovies</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProcessMovies at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
            
        movieList = port.getMovieList();
        request.setAttribute("movieList",movieList); // 
        request.getRequestDispatcher("movietab.jsp").forward(request, response);
       
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
         
        
            if(request.getParameter("add")!=null){
                request.setAttribute("title", "Add new movie");
                request.setAttribute("formType", 1);
                request.getRequestDispatcher("movieForm.jsp").forward(request, response);
                
            }else if(request.getParameter("update")!=null){
                
                BigInteger movieId = new BigInteger(request.getParameter("movieId"));
                //Movies movie = movieList.stream().filter(m->m.getMovieId().equals(movieId)).findAny().orElse(null);
                Movies movie = port.getMovie(movieId);

                //!sth to do with date
                //passing data to the form
                request.setAttribute("movie", movie);
                String movieImageUrl = Utils.ImageToString(movie.getMovieContent());
                request.setAttribute("movieImageUrl",movieImageUrl);
                request.setAttribute("formType", 3);                
                request.setAttribute("title", "Update movie");
                request.getRequestDispatcher("movieForm.jsp").forward(request, response);
         
            }else if(request.getParameter("delete")!=null){
                   
                BigInteger movieId = new BigInteger(request.getParameter("movieId"));
                this.deleteMovie(movieId);
                request.setAttribute("errorMessage", this.errorMessage);
                request.setAttribute("successMessage", this.successMessage);
                this.movieList = port.getMovieList();
                String url = "/ProcessMovies";
                request.setAttribute("movieList",movieList); // 
                request.getRequestDispatcher("movietab.jsp").forward(request, response);
            }
        
    }

    
    
    private int deleteMovie(BigInteger movieId){
        
           try {
               port.deleteMovie(movieId);
               this. successMessage="Record was deleted sucessfully";
               return 1;
           } catch (IllegalOrphanException_Exception ex) {
               Logger.getLogger(ProcessMovies.class.getName()).log(Level.SEVERE, null, ex);
               this.errorMessage = errorMessage+" Can not delete the record because it has dependencies";
               return -1;
           } catch (NonexistentEntityException_Exception ex) {
               Logger.getLogger(ProcessMovies.class.getName()).log(Level.SEVERE, null, ex);
                this.errorMessage = errorMessage+" The record does not exist";
               return -1;
           }
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
