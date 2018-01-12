package com.ofs.rest;

import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.QueryParam;  
import javax.ws.rs.core.Response;

@Path("/typejson") 
public class TypeJsonWithQueryParam {  
   
	//http://localhost:8080/SunJerseySample/rest/typejson/queryparam?msg=HELLO
	
   @GET 
   @Path("/queryparam") 
   @Produces("application/json")
   public Response getUsers(@QueryParam("msg") String msg) { 
	   
	   return Response.status(200).entity("Type JSON with Query Param : " + msg).build();
	   
   }  
}
