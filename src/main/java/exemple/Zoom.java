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
public class Zoom extends Effet {
    
    public Zoom(Bandeau monBandeau){
        super(monBandeau);
    }
    

    
    
    public void faitUnEffet(){

        monBandeau.setMessage("**********");
        for (int i = 5; i < 60 ; i+=4) {
		monBandeau.setFont(new Font("**********", Font.BOLD, 5+i));
		monBandeau.sleep(600);
        }
 
    }
}
