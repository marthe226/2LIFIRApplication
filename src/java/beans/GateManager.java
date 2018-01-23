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
public class GateManager {
    
    int IdGate;
    String nameGate;
    int StateGate;

    public GateManager(int IdGate, String nameGate, int StateGate) {
        this.IdGate = IdGate;
        this.nameGate = nameGate;
        this.StateGate = StateGate;
    }

    public GateManager() {
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public int getIdGate() {
        return IdGate;
    }

    public void setIdGate(int IdGate) {
        this.IdGate = IdGate;
    }

    public String getNameGate() {
        return nameGate;
    }

    public void setNameGate(String nameGate) {
        this.nameGate = nameGate;
    }

    public int getStateGate() {
        return StateGate;
    }

    public void setStateGate(int StateGate) {
        this.StateGate = StateGate;
    }
  
}
