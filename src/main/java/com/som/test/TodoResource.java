package com.som.test;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/todo")
public class TodoResource {
  // This method is called if XMLis request
   static Todo todo = null;
  @GET
  @Path("/app")
  @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
  public Todo getXML() {
//    Todo todo = new Todo();
//    todo.setSummary("This is my first todo");
//    todo.setDescription("This is my first todo");
    return todo;
  }
  
  // This can be used to test the integration with the browser
  @GET
  @Produces({ MediaType.TEXT_XML })
  public Todo getHTML() {
//    Todo todo = new Todo();
//    todo.setSummary("This is my first todo");
//    todo.setDescription("This is my first todo");
    return todo;
  }
  
  
    @POST
	@Path("/post")
	@Consumes("application/json")
	public Response createProductInJSON(Todo todo) {
        this.todo = todo;
		String result = "ToDo Added... : " + todo;
		return Response.status(201).entity(result).build();

	}

} 