/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02_poo_extras;

import Entidades.Puntos;
import Servicios.PuntosServicio;

/**
 *
 * @author Notebook
 */
public class Ejercicio02_POO_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntosServicio ps = new PuntosServicio();
        
        Puntos p1 = ps.crearPuntos();
        ps.disdistanciaPuntos(p1);
    }
    
}
