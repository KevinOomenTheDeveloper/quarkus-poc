//package nl.fontys.s3.resources;

//import nl.fhict.s4.models.TestModel;

//import nl.fhict.s4.services.TestService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/tests")
public class TestResource {
    @Inject TestService testService;

	@GET
    @Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Response getTest(@PathParam("id") Long id) {
        return testService.getTest(id);
    }
}