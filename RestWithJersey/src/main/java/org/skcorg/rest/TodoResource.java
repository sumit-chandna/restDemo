package org.skcorg.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.skcorg.rest.model.Todo;

@Path("/todo")
public class TodoResource {
	// This method is called if XMLis request
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Todo getXML() {
		final Todo todo = new Todo();
		todo.setSummary("This is my first todo");
		todo.setDescription("This is my first todo");
		return todo;
	}

}