/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios03_poo_extras;

import Entidades.Raices;
import Servicios.RaicesServicio;

/**
 *
 * @author Notebook
 */
public class Ejercicios03_POO_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices r1 = new Raices(1,1,0);
        RaicesServicio rs = new RaicesServicio();
        
        
        System.out.println(rs.tieneRaices(r1));
        
        rs.obtenerRaices(r1);
        
        
    }
    
}
