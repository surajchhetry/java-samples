package com.github.surajchhetry;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ping")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PingResource {

    @GET
    public Response ping(){
        JsonObject object = Json.createObjectBuilder()
                                .add("code",0)
                                .add("message","Pong")
                                .build();
        return Response.ok(object).build();
    }


}
