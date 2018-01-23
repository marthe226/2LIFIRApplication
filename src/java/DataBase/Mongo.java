/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author USER
 */
@ApplicationScoped
public class Mongo {
    private MongoClient client;

    public Mongo(MongoClient client) {
        this.client = client;
    }

    public Mongo() {
        client=new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
    }
   public DBCollection getCollection(String name){
       return (client.getDB("Mongo").getCollection(name));
   }
    
}
