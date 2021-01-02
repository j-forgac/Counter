package cz.educanet.webik;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("users")
@Produces(MediaType.APPLICATION_JSON)
public class UserResources {
	private static int counter = 0;

	@GET
	@Path("print")
	public Response getCounter() {
		return Response.ok(counter).build();
	}

	@POST
	@Path("increment")
	public Response increment() {
		counter++;
		return Response.ok().build();
	}

	@DELETE
	@Path("decrement")
	public Response decrement() {
		counter--;
		return Response.ok().build();
	}
}
