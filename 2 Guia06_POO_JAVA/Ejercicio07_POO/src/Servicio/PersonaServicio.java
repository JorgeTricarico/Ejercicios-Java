/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        
        System.out.println("Ingrese el nombre y apellido de la persona.");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad de "+nombre);
        int edad = leer.nextInt();
        String sexo;
        do {
        System.out.println("Ingrese el sexo de "+nombre);
        sexo = leer.next();
        sexo = sexo.toUpperCase();
        if ((!sexo.equals("M")&&!sexo.equals("F"))){
            System.out.println("El sexo ingresado no es M ni F. Intente nuevamente.");
        
        }
        } while (!(sexo.equals("M")||sexo.equals("F")));
        System.out.println("Ingrese el peso de "+nombre);
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura de "+nombre);
        double altura = leer.nextDouble();
        
        return new Persona(nombre,edad,sexo,peso,altura); 
    }
    
        public int calcularMC(Persona p1){
            double mc = (p1.getPeso()/(p1.getAltura()*p1.getAltura()));
            int aux=0;
            if (mc<20){
            aux=-1;
            }
            if (mc>=20&&mc<=25){
            aux=0;
            }
            if (mc>25){
            aux=1;
            }
        return aux;
        }
        public boolean esMayorDeEdad(Persona c1){
            return c1.getEdad()>=18;            
        }

}
    

