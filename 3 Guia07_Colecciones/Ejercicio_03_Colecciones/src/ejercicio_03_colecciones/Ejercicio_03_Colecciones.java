/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_03_colecciones;

import Servicios.AlumnoServicio;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio_03_Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoServicio AlumnoServ = new AlumnoServicio();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        AlumnoServ.cargarAlumno();

        System.out.println("");
        
        System.out.println(AlumnoServ.toString());
        System.out.println("Ingrese el nombre del alumno para saber la nota final.");
        System.out.println(AlumnoServ.notaFinal(leer.next()));
    }
    
}
