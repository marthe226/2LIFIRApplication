/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doc;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */


@XmlRootElement
public class UserDoc {
    String name;

    public UserDoc(String name) {
        this.name = name;
    }

    public UserDoc() {
        this.name="iiz";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
