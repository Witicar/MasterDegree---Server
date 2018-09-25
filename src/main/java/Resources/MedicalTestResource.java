package Resources;

import Models.MedicalTestRegistration;
import Models.Patient;
import Services.MedicalTestService;

import javax.persistence.Column;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("")
public class MedicalTestResource {

    MedicalTestService medicalTestService = new MedicalTestService();

    @GET
    @Path("medicalregistration")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MedicalTestRegistration> getPatients()
    {
        return medicalTestService.getMedicalTestRegistration();
    }

    @PUT
    @Path("medicalregistration/patient")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Patient postMedicalTestRegistration(Patient patient)
    {
        return medicalTestService.putMedicalTestRegistration(patient);
    }

    @PUT
    @Path("medicalregistration/move")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Patient> moveMedicalTestRegistration(@QueryParam("position") Integer position)
    {
        return medicalTestService.moveMedicalTestRegistration(position);
    }

    @DELETE
    @Path("medicalregistration/delete")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteMedicalTestRegistration()
    {
        medicalTestService.deleteMedicalTestRegistration();
    }
}
