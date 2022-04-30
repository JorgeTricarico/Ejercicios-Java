/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        Persona p1 = new Persona();
        System.out.println("Ingrese su nombre.");
        String nombre = leer.nextLine();
        p1.setNombre(nombre);
        System.out.println("Ingrese el anio de nacimiento.");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento.");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia de nacimiento.");
        int dia = leer.nextInt();

        Date fechaNacimiento = new Date(anio-1900, mes-1, dia);

        p1.setFechaNacimiento(fechaNacimiento);
            
        return p1;
    }
    
    public void calcularEdad(Persona p1){
     Date fechaActual = new Date();
       int edad = fechaActual.getYear()-p1.getFechaNacimiento().getYear();
        if (p1.getFechaNacimiento().getMonth() > fechaActual.getMonth()) {
            edad -= 1;    
        }else if (p1.getFechaNacimiento().getMonth() == fechaActual.getMonth()){
    
                if (fechaActual.getDay()<p1.getFechaNacimiento().getDay()){
                edad -= 1;
                }
    
    }
        System.out.println("...");
        
        System.out.println(fechaActual);
        
        System.out.println(p1.getFechaNacimiento());
        
        System.out.println("La edad de "+p1.getNombre()+" es de "+edad+" años.");
        
        
    }
}
