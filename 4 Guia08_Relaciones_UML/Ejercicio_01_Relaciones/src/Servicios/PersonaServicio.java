/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class PersonaServicio {
    
    private ArrayList<Persona> listaPersonas;
    private Scanner leer;
    
    public PersonaServicio() {
        this.listaPersonas = new ArrayList<>(); //  ?
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void crearPersonaAddList(){
        
        System.out.println("Enter the person's name.");
        String name = leer.next();
        System.out.println("Enter the person's last name.");
        String lastName = leer.next();
        int age = leer.nextInt();
        Integer dni = leer.nextInt();
        
        Persona Persona1 = new Persona(name, lastName, age, dni);
        
        listaPersonas.add(Persona1);
        
    }
}
