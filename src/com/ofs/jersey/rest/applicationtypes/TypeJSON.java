package com.ofs.jersey.rest.applicationtypes;

import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces; 
import javax.ws.rs.QueryParam;  
import javax.ws.rs.core.Response;

@Path("/typeJSON") 
public class TypeJSON {  
   
	//localhost:8080/SunJerseySample/rest/typeJSON/Type JSON
	
   @GET 
   @Path("/{param}")
   @Produces("application/json")
   public Response getUsers(@PathParam("param") String msg) { 
	   
	   return Response.status(200).entity("Type JSON : " + msg).build();
	   
   }  
}
