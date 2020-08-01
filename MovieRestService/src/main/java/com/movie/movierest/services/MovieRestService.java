/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.movierest.services;


import com.movie.moviesoapservice.services.MovieService;
import com.movie.moviesoapservice.services.MovieService_Service;
import com.movie.moviesoapservice.services.Movies;
import java.math.BigInteger;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author Marina
 */

@Path("movies")
@Produces("application/json")
public class MovieRestService {
    
    @Path("test")
    @GET
    public String test(){
        return "test";
    }
    
    @Path("/")
    @GET
    public List<Movies> getMovies(){
      MovieService_Service service= new MovieService_Service();
      MovieService port = service.getMovieServicePort();
      List<Movies> movieList;
      movieList = port.getMovieList();
      return movieList;
      // return    Response.ok(movieList).build();
      //specifyed xmlrootelement in generated service
    }
    
    @Path("/movie/{id}")
    @GET
    public Movies getMovieById(@PathParam("id") long movieId){
      MovieService_Service service= new MovieService_Service();
      MovieService port = service.getMovieServicePort();
      Movies movie = port.getMovie( BigInteger. valueOf(movieId));
      return movie;
      
      // return    Response.ok(movieList).build();
      //specifyed xmlrootelement in generated service
    }
    
   
    @Path("/content/{id}")
    @GET
    public byte[] getMovieContent(@PathParam("id") long movieId ){
     MovieService_Service service= new MovieService_Service();
      MovieService port = service.getMovieServicePort();
      Movies movie = port.getMovie( BigInteger. valueOf(movieId));
      return movie.getMovieContent();
      
      // return    Response.ok(movieList).build();
      //specifyed xmlrootelement in generated service
    }
    
    
}
