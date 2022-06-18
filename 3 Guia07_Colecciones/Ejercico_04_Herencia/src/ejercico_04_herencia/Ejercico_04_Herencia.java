/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico_04_herencia;

import Entidades.Circulo;
import Interfaces.calculosFormas;
import Servicio.FormasServicio;
import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercico_04_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<ArrayList> listaFormasGeometricas= new ArrayList();
        Integer opcion;
        FormasServicio s1 = new FormasServicio();
        do {
            System.out.println("1. Agregar Circulo. \n"
                             + "2. Agregar Rectangulo. \n"
                             + "3. Salir y mostrar todos los datos.\n");
            System.out.print("Elija: ");
            opcion = leer.nextInt();
                
         switch (opcion){
             case 1:
                 System.out.println("Elijio Circulo.");
                 System.out.println("---------------");
                 s1.crearCirculo();
                 
             case 2:
         }   
        
        } while (opcion.equals(3));
   
    }
    
}
