package Resources;

import Services.LoginService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path("/patient/login")
public class LoginResource {

    LoginService loginService = new LoginService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getLoginData(@QueryParam("login") String login)
    {
        return loginService.getLoginData(login);
    }
}
