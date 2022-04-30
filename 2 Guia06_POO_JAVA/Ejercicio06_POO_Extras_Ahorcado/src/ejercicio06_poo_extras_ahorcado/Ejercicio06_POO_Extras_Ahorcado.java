/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06_poo_extras_ahorcado;

import Entidades.Ahorcado;
import Servicios.AhorcadoServicio;

/**
 *
 * @author Notebook
 */
public class Ejercicio06_POO_Extras_Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AhorcadoServicio as = new AhorcadoServicio();
        
        Ahorcado a1 = as.crearJuego();
        
        as.longitud(a1);
        
        do {
            System.out.println("");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
           char letra=as.buscar(a1);
        
        as.encontradas(letra,a1); 
        } while (a1.getIntentos()>0);
        
        
        
    }
    
}
