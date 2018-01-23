/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;

/**
 *
 * @author USER
 */
@Stateless
public class LuminosityManager {
       public String getLuminosity(){
        return "je test mon web service";
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
