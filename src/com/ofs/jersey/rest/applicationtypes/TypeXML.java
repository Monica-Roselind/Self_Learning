package com.ofs.jersey.rest.applicationtypes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.ofs.entity.Book;

@Path("/typeXML")
public class TypeXML {

	//http://localhost:8080/SunJerseySample/rest/typeXML/2
	
	 @GET
	 @Produces("application/XML")
	 @Path("/{id}")
	 public Response getAllBooks(@PathParam("id") String bookId){
		 Book book = new Book();
		 book.setId(bookId);
		 book.setName("Harry Potter");
		 book.setVolumeNumber(1);
		 book.setAuthorName("J. K. Rowling");
		 return Response.status(200).entity(book).build();
	  }
	
}
