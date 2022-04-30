/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Jugador;
import Entidades.RevolverDeAgua;

/**
 *
 * @author Notebook
 */
public class JugadorServicio {
    
    public boolean disparo(RevolverDeAgua r, Jugador j1){
        
        
        RevolverServicio r1 = new RevolverServicio();
        
        j1.setMojado(r1.mojar(r));
       
        
        if (!j1.isMojado()) {
            r1.siguienteChorro(r);
        }
        
        
        
        
        return r1.mojar(r);
    }
}
