/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12_poo;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Notebook
 */
public class Ejercicio12_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        
        ps.calcularEdad(p1);
        
    }
    
}
