/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04_poo_extras;

import Entidades.NIF;
import Servicios.NIFServicio;

/**
 *
 * @author Notebook
 */
public class Ejercicio04_POO_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NIFServicio ns = new NIFServicio();
        
        NIF n1 = ns.crearNif();
        
        
        System.out.println(n1.toString());
        
        
        
    }
    
}
