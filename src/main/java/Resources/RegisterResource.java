package Resources;

import Models.Patient;
import Services.RegisterService;
import jdk.nashorn.internal.parser.JSONParser;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/patient/register")
public class RegisterResource {

    RegisterService registerService = new RegisterService();

    @Path("/login")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean isRegisterLoginMailExist(@QueryParam("login") String login, @QueryParam("mail") String mail)
    {
        return registerService.isRegisterLoginMailExist(login, mail);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Patient postRegisterData(Patient patient)
    {
        return registerService.postRegisterData(patient);
    }
}
