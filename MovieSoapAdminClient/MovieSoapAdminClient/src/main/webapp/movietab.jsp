<%-- 
    Document   : MovieList
    Created on : Jul 27, 2020, 1:26:50 PM
    Author     : Marina
--%>
<%@page language="java" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList" %>
<%@page import="client.Movies" %>
<%@page import="com.movie.adminclient.utils.Utils" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="ISO-8859-1">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>movies</title>
       
    </head>
    <body>
        <h1>Manage Movie List</h1> 
         <%
             String errorMessage = "";
             String successMessage ="";
             ArrayList<Movies> movieList = new ArrayList();
             if(request.getAttribute("errorMessage")!= null){
                errorMessage = (String)request.getAttribute("errorMessage");
            }
             if(request.getAttribute("successMessage")!= null){
                successMessage  = (String)request.getAttribute("successMessage ");
             }
             if(request.getAttribute("movieList")!= null){
                movieList =  (ArrayList<Movies>) request.getAttribute("movieList");
             }

         %>
        
        <c:if test="${not empty errorMessage}">
             <div class="alert alert-danger" role="alert"><c:out value="${errorMessage}" /></div>
        </c:if>

        <c:if test="${not empty successMessage}">
            <div class="alert alert-success" role="alert"><c:out value="${successMessage}" /></div>
        </c:if>
         
         
         <hr>
         <p>Total movies: <%=movieList.size()%>&nbsp;&nbsp; 
            <form action= "ProcessMovies" method="post">
                <button type="submit" class="btn btn-outline-primary" name="add">Add new movie</button>
            </form>    
         </p>

         
              
            <table class="table table-striped table-hover">
                 <thead class="thead-dark">
                <tr>
                    <th> Movie ID</th>
                    <th> Movie Name</th>
                    <th> Movie Type</th>
                    <th> Movie Series</th>
                    <th> Movie release date</th>
                    <th> Movie filename</th>
                    <th> Movie content</th>
                    <th></th>
                    <th> </th>
                    <th> </th>
                    <th> </th>
                </tr>
                 </thead>
              
                <%for(Movies movie:movieList){%>    
                    <tr>
                        <form action= "ProcessMovies" method="post">
                            <td><input readonly class="form-control-plaintext" type='text' name ='movieId' value='<c:out value="<%=movie.getMovieId()%>"/>'/></td>
                            <td><input readonly class="form-control-plaintext" type='text' name ='movieName' value='<c:out value="<%=movie.getMovieName()%>"/>'/></td>
                            <td><input readonly class="form-control-plaintext" type='text' name ='movieType' value='<c:out value="<%=movie.getMovieType()%>"/>'/></td>
                            <td><input readonly class="form-control-plaintext" type='text' name ='movieSeries' value='<c:out value="<%=movie.getMovieSeries()%>"/>'/></td>
                            <td><input readonly class="form-control-plaintext" type='text' name ='dateRelease' value='<c:out value="<%=movie.getDateRelease()%>"/>'/></td>
                            <td><input readonly class="form-control-plaintext" type='text' name ='movieFilename' value='<c:out value="<%=movie.getMovieFilename()%>"/>'/></td>
                            <% String imageUrl = Utils.ImageToString(movie.getMovieContent());%>
                            <td><img width="60" height="60" src="<%=imageUrl%>"/></td>
                            <td><button type="submit" class="btn btn-outline-primary" name='update'>Update</button></td>
                            <td><button type="submit" class="btn btn-outline-danger" name='delete'>Delete</button></td>
                        </form>
                        </tr>
                <%}%>     
                
            </table>
           	
    

    </body>
</html>
