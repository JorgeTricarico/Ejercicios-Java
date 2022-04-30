/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class AlumnoServicio {

    private ArrayList<Alumno> listaAlumnos;
    private Scanner leer;

    public AlumnoServicio() {
        this.listaAlumnos = new ArrayList<>(); //  ?
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargarAlumno() {
        Alumno a1 = new Alumno();               //Creo un alumno.

        agregarNombre(a1);
        agregarNotas(a1);
                
        agregarOtroAlumno(a1);
    }
    
    public float notaFinal(String nombreAlumno){
        
        for (Alumno aux : listaAlumnos) {
            if (aux.getNombre().equals(nombreAlumno.toUpperCase())) {
                float suma=0;
                for (Integer notas : aux.getNotas()) {
                    suma+= notas;
                }
                
                float promedio = suma/3;
                
                return promedio;
            }
        }
        
        return 0;
    }

    public Alumno agregarNotas(Alumno a1){
        
        ArrayList<Integer> notas = new ArrayList<>();   //Creo ArrayList auxiliar
                                                        // y guardo las 3 notas acá.
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Ingrese la nota "+(i+1)+" de 3");
            notas.add(leer.nextInt());
        }
        
        a1.setNotas(notas);         
        
        listaAlumnos.add(a1);
        
        return null;
    
    }
    
    public Alumno agregarNombre(Alumno a1){
        
        System.out.println("Ingrese el nombre y apellido del alumno: ");
        
        String nombreIngresado = leer.next().toUpperCase();
        
        a1.setNombre(nombreIngresado);
        
        return null;
    }
    
    public Alumno agregarOtroAlumno(Alumno a1){
        
        System.out.println("Desea cargar otro alumno? S/N.");
        String yesOrNot = leer.next().toLowerCase();
        
        if ("s".equals(yesOrNot)) {
            
          cargarAlumno(); 
        }
        
        
        return null;
    }
    @Override
    public String toString() {
        return "AlumnoServicio{" + "nuevaLista=" + listaAlumnos + '}';
    }
    
    
}
