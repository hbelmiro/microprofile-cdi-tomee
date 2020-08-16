package com.hbelmiro.microprofile.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@ApplicationScoped
@Produces(MediaType.TEXT_PLAIN)
public class PortfolioController {

    @Inject
    Portfolio portfolio;

    @GET
    public String printProfit() {
        return "Current profit is: " + this.portfolio.computePortfolioProfit();
    }

}

