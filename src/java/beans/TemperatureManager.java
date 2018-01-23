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
public class TemperatureManager {

   
     public String getTemperature(){
         
         
        return "je test mon web service";
    }
}
