package com.ofs.jersey.rest.parametertypes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/pathParam")
public class ParamPath {

	//localhost:8080/SunJerseySample/rest/pathParam/Path Param
	
	@GET
	@Path("/{param}")
	@Produces("text/plain")
	public Response getMsg(@PathParam("param") String msg) {
		return Response.status(200).entity("Path Param : " + msg).build();
	}
	
	//localhost:8080/SunJerseySample/rest/pathParam/Path Param1/Path Param2 
	
	@GET
	@Path("/{param1}/{param2}")
	@Produces("text/plain")
	public Response getPathParam(@PathParam("param1") String msg1, @PathParam("param2") String msg2) {
		return Response.status(200).entity("Path Param with 2 params: " + msg1 + " : " + msg2).build();
	}
	
}
