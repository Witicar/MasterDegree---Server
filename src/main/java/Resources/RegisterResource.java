package Resources;

import Models.Address;
import Models.Patient;
import Services.RegisterService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("")
public class RegisterResource {

    RegisterService registerService = new RegisterService();

    @Path("patient/register/login")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean isRegisterLoginMailExist(@QueryParam("login") String login, @QueryParam("mail") String mail)
    {
        return registerService.isRegisterLoginMailExist(login, mail);
    }

    @Path("patient/register")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Patient postPatientData(Patient patient)
    {
        return registerService.postPatientData(patient);
    }
}
