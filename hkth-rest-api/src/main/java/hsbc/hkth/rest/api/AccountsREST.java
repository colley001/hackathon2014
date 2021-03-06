package hsbc.hkth.rest.api;

import hsbc.hkth.bo.AccountBO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.JsonArray;

@Path("/a")
public class AccountsREST {

	@GET
	@Path("/accounts")
	@Produces(MediaType.APPLICATION_JSON)
	public Response responseMsg() {
		AccountBO accountBO = new AccountBO();
		JsonArray accounts = accountBO.getAccounts();
		return Response.status(200).entity(accounts.toString()).build();
	}
}