/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_04_colecciones;

import Servicios.PeliculaServicio;
import com.oracle.webservices.internal.api.message.MessageContextFactory;

/**
 *
 * @author Notebook
 */
public class Ejercicio_04_Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio ps = new PeliculaServicio();
        
        ps.crearPelicula();
        
        
        System.out.println("Todas las peliculas: ");
        System.out.println(ps.toString());
        
        ps.mostrarMasDe60Min();
        
        ps.ordenarDuracionDeMenorAMayor();
        ps.ordenarDuracionDeMayorAMenor();
        ps.ordenarPorTitulo();
        ps.ordenarPorDirector();
        
    }
    
}
