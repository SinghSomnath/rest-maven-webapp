package com.som.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
		
//		return output;
 
	}
	
	
//	@GET
//	@Path("/get")
//	public Response testRest() {
// 
//		return Response.status(201).entity("Will kill you...").build();
// 
//	}
	
//	@GET
//	@Path("/get")
//	@Produces(MediaType.TEXT_PLAIN)
//	public Response getProductInJSON() {
// 
//		Product product = new Product();
//		product.setName("iPad 3");
//		product.setQty(999);
// 
//		return Response.status(201).entity("Killer...").build(); 
// 
//	}
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProductInJSON() {
 
		Product product = new Product();
		product.setName("iPad 3");
		product.setQty(999);		
		return Response.status(201).entity(product).build();
				
 
	}
 
}
