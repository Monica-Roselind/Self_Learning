package com.ofs.jersey.rest.parametertypes;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

@Path("/header") 
public class ParamHeader {  
   
	//http://localhost:8080/SunJerseySample/rest/header/headerParam1
	
   @GET 
   @Path("/headerParam1") 
   public Response getParam(@HeaderParam("user-agent") String userAgent) { 
	   
	   return Response.status(200).entity("Header Param : " + userAgent).build();
	   
   }
   
   //Alternate way
   
   //http://localhost:8080/SunJerseySample/rest/header/headerParam2
   @GET
   @Path("/headerParam2")
   public Response addUser(@Context HttpHeaders headers) {

	   String userAgent = headers.getRequestHeader("user-agent").get(0);

	   return Response.status(200).entity("addUser is called, userAgent : " + userAgent).build();

	}
   
}