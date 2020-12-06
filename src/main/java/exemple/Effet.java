/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author Utilisateur
 */
public abstract class Effet {
    
    public Bandeau monBandeau;
    public String message;
    
    public Effet(Bandeau monBandeau){
        this.monBandeau = monBandeau;
    }
    
    public Bandeau setMonBandeau(){
        return this.monBandeau;
    }
    
    public Bandeau getMonBandeau(){
        return this.monBandeau;
    }
    
    public String setMessage(String message){
        return this.message;
    }
    
    public String getMessage(){
        return this.message;
    }
    
    public abstract void faitUnEffet();
    
    
    
}
