package com.karthik.echo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/echo")
public class EchoService {

    @GET
    public String echo() {
        return "echo";
    }
}
