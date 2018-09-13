package Resources;

import Models.Address;
import Models.Patient;
import Services.AccountService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("")
public class AccountResource {

    AccountService accountService = new AccountService();

    @Path("account/patient")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Patient postPatientData(@QueryParam("login") String login,  Patient patient)
    {
        return accountService.putPatientData(login, patient);
    }

    @Path("account/address")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Address getAddress(@QueryParam("login") String login)
    {
        return accountService.getAddressData(login);
    }
}
