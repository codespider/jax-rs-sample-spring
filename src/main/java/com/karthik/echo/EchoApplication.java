package com.karthik.echo;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;
@ApplicationPath("hi")
public class EchoApplication extends ResourceConfig {

    public EchoApplication() {
        packages("com.karthik.echo");
    }
}