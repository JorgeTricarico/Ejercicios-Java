/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11_poo;

import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Notebook
 */
public class Ejercicio11_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fechaActual = new Date();
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el anio de nacimiento.");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento.");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia de nacimiento.");
        int dia = leer.nextInt();
        
        
        Date fechaNacimiento = new Date(anio-1900, mes-1, dia);
        System.out.println(fechaNacimiento);
        
       int edad = (fechaActual.getYear()-fechaNacimiento.getYear());
        
        
        if (fechaActual.getMonth()<fechaNacimiento.getMonth()) {
            edad-=1;
        }else if (fechaActual.getMonth()==fechaNacimiento.getMonth()) {
            if (fechaActual.getDay()<=fechaNacimiento.getDay()) {
                edad-=1;
            }
        }
        
         
        System.out.println("Usted tiene aproximadamente "+edad);
    }

    
    
}
