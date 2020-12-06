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
public class DemonstrationSignificative {
    
    public static void main(String[] args){
        Bandeau monBandeau = new Bandeau();
        String message = new String();
        Scenario scenario = new Scenario();
        Clignotant clignotant = new Clignotant(monBandeau);
        Zoom zoom = new Zoom(monBandeau);
        ChangerDeCouleur changeDeCouleur = new ChangerDeCouleur(monBandeau, message);
        scenario.repeteEffetnFois(clignotant, 1);
        scenario.repeteEffetnFois(zoom, 1);
        scenario.repeteEffetnFois(changeDeCouleur, 2);
        scenario.activationEffet();
    }
    
    
}
