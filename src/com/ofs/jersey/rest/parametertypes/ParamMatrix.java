package com.ofs.jersey.rest.parametertypes;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/matrixParam")
public class ParamMatrix {
	
	//http://localhost:8080/SunJerseySample/rest/matrixParam/2018;author=OFS;country=India
	@GET
	@Path("{year}")
	public Response getBooks(@PathParam("year") String year,
			@MatrixParam("author") String author,
			@MatrixParam("country") String country) {

		return Response.status(200).entity("Year : " + year	+ ", Author : " + author + ", Country : " + country).build();

	}
	
}
