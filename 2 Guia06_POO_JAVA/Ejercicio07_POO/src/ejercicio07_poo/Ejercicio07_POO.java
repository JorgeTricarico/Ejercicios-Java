/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07_poo;

import Entidades.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio07_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de personas. (El ejercicio dice 4)");
        int nPersonas = leer.nextInt();
        PersonaServicio ps = new PersonaServicio();
        Persona p1[] = new Persona[nPersonas];
        for (int i = 0; i < 4; i++) {
            System.out.println("Persona numero "+(i+1));
            System.out.println("");
//            p1[i]= ps.crearPersona();
            p1[i]= null;
            
//            switch(ps.calcularMC(p1[i])){
//            
//                case -1:
//                    System.out.println("Persona"+(i+1)+": "+p1[i].getNombre()+" tiene bajo peso.");
//                    break;
//                case 0:
//                    System.out.println("Persona"+(i+1)+": "+p1[i].getNombre()+" tiene peso ideal.");
//                    break;
//                case 1:
//                    System.out.println("Persona"+(i+1)+": "+p1[i].getNombre()+" tiene sobre peso.");
//                    break;    
//            }
            
            if (18<p1[i].getEdad()){
            
                System.out.println("Persona"+(i+1)+p1[i].getNombre()+" es MAYOR de edad.");
            }else {
            System.out.println("Persona"+(i+1)+" "+p1[i].getNombre()+" es MENOR de edad.");
            }
            
            
            
            
            
            
        }
        
        
        
    }
    
}
