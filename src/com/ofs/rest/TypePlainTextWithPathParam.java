package com.ofs.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/typeplaintext")
public class TypePlainTextWithPathParam {

	//localhost:8080/SunJerseySample/rest/typeplaintext/Path Param
	
	@GET
	@Path("/{param}")
	@Produces("text/plain")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Type Plain Text with Path Param : " + msg;

		return Response.status(200).entity(output).build();

	}
}
