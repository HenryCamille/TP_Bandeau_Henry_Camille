/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Utilisateur
 */
public class ChangerDeCouleur extends Effet {
    
        public ChangerDeCouleur(Bandeau monBandeau, String message){
            super(monBandeau);
            setMessage(message);
            
        }
    
    
    
    public void faitUnEffet(){

        monBandeau.setMessage("Guillaume Apollinaire");
        monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 22));
        for (int i=1; i<10; i++) {
            if (i%2 == 0) {
                monBandeau.setForeground(Color.BLACK);
                monBandeau.setBackground(Color.lightGray);
                monBandeau.sleep(1000);
            } 
            else {
                monBandeau.setForeground(Color.ORANGE);
                monBandeau.setBackground(Color.darkGray);
                monBandeau.sleep(1000);
                }
        }
        monBandeau.sleep(500);
        
    }
    
    
    
}
