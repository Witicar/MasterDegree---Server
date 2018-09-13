package Resources;

import Models.Doctor;
import Models.HoursOfAdmission;
import Models.Patient;
import Models.Visit;
import Services.TestService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("")
public class TestResource {

    TestService testService = new TestService();

    @Path("test/doctor")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Doctor postDoctorData(Doctor doctor)
    {
        return testService.postDoctor(doctor);
    }

    @Path("test/hoursofadmission")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public HoursOfAdmission postHoursOfAdmissionData(HoursOfAdmission hoursOfAdmission)
    {
        return testService.postHoursOfAdmission(hoursOfAdmission);
    }

    @Path("test/visit")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Visit postVisit(Visit visit)
    {
        return testService.postVisit(visit);
    }
}
