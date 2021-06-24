//package nl.fontys.s3.services;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import io.quarkus.panache.common.Parameters;
//import nl.fhict.s4.models.TestModel;
@ApplicationScoped

public class TestService {
    
    public Response getTest(Long id) {
        Response response = Response.noContent().build();
        TestModel test = TestModel.findById(id);
        if(test != null) {
            response = Response.ok(test).build();
        }
        return response;
    }
}