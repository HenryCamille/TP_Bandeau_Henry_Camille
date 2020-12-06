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
public class Clignotant extends Effet {
    
    public Clignotant(Bandeau monBandeau){
        super(monBandeau);
    }
    
    
    

    
    // Afficher le texte en noir sur fond blanc puis en blanc sur fond blanc pour faire clignotter.
    
      
        
        public void faitUnEffet() {
        
            monBandeau.setMessage("Il est grand temps de rallumer les étoiles");
            monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 17));
            for (int i=1; i<10; i++) {
                if (i%2 == 1) {
                    monBandeau.setForeground(Color.BLACK);
                    monBandeau.sleep(1000);
                } else {
                    monBandeau.setForeground(Color.WHITE);
                    monBandeau.sleep(1000);
                }
            }
            monBandeau.sleep(1000);
    }
    
    
}
