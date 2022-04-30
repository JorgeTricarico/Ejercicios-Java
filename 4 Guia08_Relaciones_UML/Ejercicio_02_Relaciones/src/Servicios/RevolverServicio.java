/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.RevolverDeAgua;
import java.util.Objects;

/**
 *
 * @author Notebook
 */
public class RevolverServicio {
    
    public RevolverDeAgua llenarRevolver() {
        
        
        
        return new RevolverDeAgua((int)(Math. random()*10+1), (int)(Math. random()*10+1));
    }
    
    public boolean mojar(RevolverDeAgua RA) {
        return Objects.equals(RA.getPosicionActual(), RA.getPosicionAgua());
    }
    
    public void siguienteChorro (RevolverDeAgua RA) {
    
        if (RA.getPosicionActual()<= 10) {
            
            RA.setPosicionAgua(1);
        } else {
            RA.setPosicionAgua(RA.getPosicionAgua()+1);
        }
    
    }
    
    public String toString(RevolverDeAgua RA){
        return "La posicion actual es: "+RA.getPosicionActual()+" y el agua esta en la posicion "+RA.getPosicionAgua();
    }
    
    
}
