/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01_poo;

import Entidades.Libro;
import Servicios.ServicioLibro;

/**
 *
 * @author Notebook
 */
public class Ejercicio01_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioLibro LibroA = new ServicioLibro();
        Libro Libro01 = LibroA.altaLibro();
        
        System.out.println(Libro01);
        
       
    }
    
}
