/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import DataBase.Mongo;
import Doc.UserDoc;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.naming.Context;
import static javax.naming.Context.BATCHSIZE;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.bson.Document;

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
     public String getUser2(){
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
            
            MongoDatabase database = mongo.getClient().getDatabase("test");
            MongoCollection<Document> coll = database.getCollection("User");
            
        return "je test mon web service user"+  coll.count();//mongo.getCollection("User");
                //mongo.getClient().getDatabaseNames();//.getCollection("User").find().toString();//res
                
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
     public  String getUser(){//Response
        /* Document myDoc;
    //    myDoc = mongo.getCollection("User").find();
         
            MongoDatabase database = mongo.getClient().getDatabase("test");
            MongoCollection<Document> coll = database.getCollection("User");
            UserDoc a= new UserDoc();
          //  a.setName(coll.find().toString());
            
            GenericEntity<UserDoc> entity = new GenericEntity<UserDoc>(a) {};
            //GenericEntity<List<Product>> entity = new GenericEntity<List<Product>>(product) {};
            return Response.ok(entity).build(); */
       //   return Response.status(200).entity(coll.toString()).build();
       //return "iiiii";
         return "users";
     }
}
