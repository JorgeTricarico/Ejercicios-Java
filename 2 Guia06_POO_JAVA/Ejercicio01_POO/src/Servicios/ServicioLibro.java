/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class ServicioLibro {
    
    
    public Libro altaLibro(){
        
        //Instanciar objeto tipo Libro
        
        Libro Libro01 = new Libro();
        
        //Llenar los atributos
        System.out.println("Ingrese el titulo del libro a cargar");
        Scanner leer = new Scanner(System.in);
        
        Libro01.setTitulo(leer.next());
        
        System.out.println("Ingrese el autor del libro a cargar");
        Libro01.setAutor(leer.next());
        
        System.out.println("Ingrese el numero de paginas.");
        Libro01.setNumeroDePaginas(leer.nextInt());
        
        System.out.println("Ingrese el ISBN");
        Libro01.setISBN(leer.nextInt());
        
        return Libro01;
           
    }
}
