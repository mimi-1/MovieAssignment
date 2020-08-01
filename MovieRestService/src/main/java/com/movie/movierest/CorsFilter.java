package com.movie.movierest;


import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;


/**
 *
 * @author Marina
 */

//Provider annotation will be wired when the app is running 
@Provider
public class CorsFilter implements ContainerResponseFilter{

    @Override
    public void filter(final ContainerRequestContext crc, final ContainerResponseContext crc1) throws IOException {
          crc1.getHeaders().add("Access-Control-Allow-Origin", "*");
          crc1.getHeaders().add("Access-Control-Allow-Headers", "origin,content-type,accept,authorization");
          crc1.getHeaders().add("Access-Control-Allow-Credentials", "true");
          crc1.getHeaders().add("Access-Control-Allow-Methods", "GET,POST,DELETE,PUT,OPTIONS,HEAD");
          crc1.getHeaders().add("Access-Control-Max-Age", "1209600");
    }
}
