/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import beans.UserManager;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author USER
 */
@Path("user")
public class User {
      //injection d'EJB
    @EJB
    UserManager manager;
    

    @GET
    @Path("/get")
    @Produces( MediaType.APPLICATION_JSON)
    public String getString2(){//Response
        return manager.getUser();
        
    }
}
