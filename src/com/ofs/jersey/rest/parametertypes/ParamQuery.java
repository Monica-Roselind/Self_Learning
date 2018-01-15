package com.ofs.jersey.rest.parametertypes;

import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.QueryParam;  
import javax.ws.rs.core.Response;

@Path("/query") 
public class ParamQuery {  
   
	//http://localhost:8080/SunJerseySample/rest/query/queryParam1?msg=HELLO
	
   @GET 
   @Path("/queryParam1") 
   @Produces("application/json")
   public Response getParam(@QueryParam("msg") String msg) { 
	   
	   return Response.status(200).entity("Query Param : " + msg).build();
	   
   }  
   
   //http://localhost:8080/SunJerseySample/rest/query/queryParam2?msg1=Hello&msg2=Welcome
   @GET 
   @Path("/queryParam2") 
   @Produces("application/json")
   public Response getQueryParam(@QueryParam("msg1") String msg1, @QueryParam("msg2") String msg2) { 
	   
	   return Response.status(200).entity("Query Param with 2 params : " + msg1 + " : " + msg2).build();
	   
   }  
   
}
