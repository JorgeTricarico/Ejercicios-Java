/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_01_relaciones;

import Entidades.Perro;
import Entidades.Persona;
import Enumeraciones.RazaPerro;
import Servicios.PerroServicio;
import Servicios.PersonaServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.ListAdapter;

/**
 *
 * @author Notebook
 */
public class MainPersonaPerro {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private static PersonaServicio personaServ = new PersonaServicio();
    private static PerroServicio  perroServ= new PerroServicio();
    
    public static void main(String[] args) {
        
        
        ArrayList listaPerros = perroServ.crearPerro();
       
        
        for (Object arg : listaPerros ) {
            System.out.println(arg.toString());
        }
    }
    
}
