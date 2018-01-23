/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import DataBase.Mongo;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.Iterator;
import javax.inject.Inject;
import javax.naming.Context;
import static javax.naming.Context.BATCHSIZE;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author USER
 */
@Stateless
public class UserManager {
    @Inject Mongo mongo;
            
  // Mongo mongo=new Mongo();
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
     public String getUser(){
            DBCursor cursor= mongo.getCollection("User").find();
            Iterator<DBObject> iter = cursor.iterator();
            int count=0;
            String res="";
            while(iter.hasNext())
                    {
                        
                        DBObject dbo=iter.next();
                        System.out.println("user: "+dbo.toString());
                        res.concat("  +  "+dbo.toString());
                    }
            
        return "je test mon web service user"+  res;
                
    }
}
