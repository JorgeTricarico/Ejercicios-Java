/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteranuevo;

import cafeteranuevo.Entidades.Cafetera;
import cafeteranuevo.Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class CafeteraNuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CafeteraServicio cs = new CafeteraServicio();
        double cantidadActual = 0;
        double capacidadMaxima;

        capacidadMaxima = cs.crearCafetera();
        
        cantidadActual = cs.llenarCafetera(capacidadMaxima);
        
        cantidadActual = cs.servirTaza(cantidadActual);
        
        cs.toString();
        
        cs.agregarCafe();
        
        cantidadActual = cs.vaciarCafetera();
        
    }
    
}
