package Resources;

import Models.Doctor;
import Models.HoursOfAdmission;
import Models.Patient;
import Models.Visit;
import Services.RegistrationService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("")
public class RegistrationResource {

    private RegistrationService registrationService = new RegistrationService();

    @Path("registration/patient")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Patient getPatient(@QueryParam("login") String login)
    {
        return registrationService.getPatient(login);
    }

    @Path("registration/doctors")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Doctor> getDoctors()
    {
        return registrationService.getDoctors();
    }

    @Path("registration/visites")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Visit> getVisites(@QueryParam("login") String login)
    {
        return registrationService.getVisites(login);
    }

    @Path("registration/")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Visit putVisit(Visit visit,@QueryParam("login") String login,@QueryParam("doctor_id") long doctor_id)
    {
        return registrationService.putVisit(visit, login, doctor_id);
    }

    @Path("registration/visites")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Visit> putVisites(@QueryParam("hour") int hour)
    {
        return registrationService.putVisites(hour);
    }
}
