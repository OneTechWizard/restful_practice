import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/telecoms")
public class Telecoms {

    @GET
    @Path("/get-numbers")
    @Produces("text/plain")
    public String getNumbers(){
        return "all the numbers";
    }

    @GET
    @Path("/get-numbers-for/{userid}")
    @Produces("text/plain")
    public String getNumbersFor(@PathParam("userid") int userid){
        return "all the numbers for " + userid;
    }

    @GET
    @Path("/activate-number/{number}")
    @Produces("text/plain")
    public String doActivateNumber(@PathParam("number") int number){
        return "Activated";
    }
}