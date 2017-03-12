package com.som.test;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class TestRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		System.out.println(service.path("rest").path("todo").path("app").accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(String.class));
		System.out.println(service.path("rest").path("todo").accept(MediaType.TEXT_XML).get(String.class));

	}


	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/rest-web/").build();
	}
}
