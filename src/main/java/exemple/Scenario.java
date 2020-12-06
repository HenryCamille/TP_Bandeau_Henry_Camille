/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import java.util.*;
import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Utilisateur
 */
public class Scenario {
    
    private final List<Effet> effets = new LinkedList<>();
    
    
    
    public void repeteEffetnFois(Effet effet, int n){
        for( int i =0 ; i<n ; i++){
            this.effets.add(effet);
        }
    }
    
    
    public void activationEffet(){
        for(Effet effet: effets){
            effet.faitUnEffet();
        
        }
    }
    
}
