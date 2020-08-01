<%-- 
    Document   : movieForm
    Created on : Jul 27, 2020, 4:02:56 PM
    Author     : Marina
--%>


<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="client.Movies" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
          <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
          <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <title>add/update movie form</title>
    </head>
    <body>
        <%
            Movies  movie =null;
            int formType = 1; //add
            String title = (String) request.getAttribute("title");
          if(request.getAttribute("movie")!= null){
              movie =  (Movies) request.getAttribute("movie");
           }
          String movieImageUrl = (String) request.getAttribute("movieImageUrl");
        
         %>
        
        
        
    <div class="container p-3 border bg-light">
     <a href="./ProcessMovies">Back to list</a> &nbsp;&nbsp;
     <a href="./">go Home</a>
     <h1>${title}</h1>
     <form  class="form-horizontal" action= "ProcessAddMovie" method="POST" enctype="multipart/form-data" >
        
         <input type="hidden" name="movieId" value="${movie.movieId}" >
         <img  width="200" height="200" alt="should be image here" src="${movieImageUrl}"/>
         
        <div class="form-group row">
      		<label class="control-label col-sm-1" for="movieName">Name:</label>
      		<div class="col-sm-10">
        		<input type="text" class="form-control" placeholder="Enter movie name" name="movieName" required value="${movie.movieName}">
        		</div>
        </div>
        <div class="form-group row">
        <label class="control-label col-sm-1" for="">Type:</label>
        <div class="col-sm-10">
        	<input type="text" class="form-control" placeholder="Enter movie type" name="movieType" value="${movie.movieType}" >
        </div>
   	   </div>
	   <div class="form-group row">
      		<label class="control-label col-sm-1" for="age">Series:</label>
      		<div class="col-sm-3">
        		<input type="text" class="form-control"  placeholder="Enter series" name="movieSeries" value="${movie.movieSeries}">
     		 </div>
   	   </div>         
           <div class="form-group row">
      		<label class="control-label col-sm-1" for="movieRelease">Release:</label>
      		<div class="col-sm-10">
        		<input type="date" class="form-control"  name="movieRelease" />
     		 </div>
    	    </div>
         
           <div class="form-group row">
      		<label class="control-label col-sm-1" for="movieFilename">File name to save:</label>
      		<div class="col-sm-10">
        		<input type="text" class="form-control"  id="movieFilename" name="movieFilename" value="${movie.movieFilename}" />
     		 </div>
    	    </div>      
                    
        <div class="form-group">
            <p>Upload file: </p>
            <div class="custom-file mb-3">
              <input type="file" name="filepath" id="filepath" />
            </div>
        </div>
         
           <div class="form-group row">
           <div class="col-sm-10">
            <c:if test="${formType==1}">
              <input class="btn btn-primary" type="submit" value="Add" name="add" />&nbsp;&nbsp;
            </c:if>
             
             <c:if test="${formType!=1}">
              <input class="btn btn-primary" type="submit" value="Update" name="update"/>&nbsp;&nbsp;
            </c:if>
             
             <input class="btn btn-primary" type="reset" value="Reset"/>
          </div>
          </div>
     </form>
     
    <script>
        $("#filepath").on("change", function() {
          var fileName = $(this).val().split("\\").pop();
          //$(this).siblings(".custom-file-label").addClass("selected").html(fileName);
          $("#movieFilename").val(fileName);
        });
    </script>

     
        <c:if test="${not empty errorMessage}">
             <div class="alert alert-danger" role="alert"><c:out value="${errorMessage}" /></div>
        </c:if>

        <c:if test="${not empty successMessage}">
            <div class="alert alert-success" role="alert"><c:out value="${successMessage}" /></div>
        </c:if>
              
    	</div>
    </body>
</html>