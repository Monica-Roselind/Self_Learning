package com.ofs.jersey.rest.applicationtypes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/typePlainText")
public class TypePlainText {

	//localhost:8080/SunJerseySample/rest/typePlainText/Plain Text
	
	@GET
	@Path("/{param}")
	@Produces("text/plain")
	public Response getMsg(@PathParam("param") String msg) {

		return Response.status(200).entity("Type Plain Text : " + msg).build();

	}
}
