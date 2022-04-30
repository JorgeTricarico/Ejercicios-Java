/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteranuevo.Servicio;

import cafeteranuevo.Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class CafeteraServicio {
    
 Scanner leer = new Scanner(System.in);
    public double crearCafetera() {
        Cafetera c1 = new Cafetera();
        c1.setCapacidadMaxima(2000);
        c1.setCantidadActual(0);
        return c1.getCapacidadMaxima();
    }

    public double llenarCafetera(double capacidadMaxima) {
            Cafetera c1 = new Cafetera();
            c1.setCantidadActual(capacidadMaxima);
            System.out.println("La cafetera esta llena! Tiene "+c1.getCantidadActual()+" ml.");
     
            
            return c1.getCantidadActual();    
    }
    
    public double servirTaza(double cantidadActual){
        
        Cafetera c1 = new Cafetera();
        System.out.println("Ingrese la cantidad de ml de la taza a llenar.");
        double tamanioTaza = leer.nextDouble();
        
        System.out.println(c1);
        if (tamanioTaza<= cantidadActual){
        
        cantidadActual-= tamanioTaza;
            System.out.println("La taza fue servida correctamente, quedan "+cantidadActual+"ml.");
            c1.setCantidadActual(cantidadActual);
            
        return c1.getCantidadActual();
        }else {
            cantidadActual=0;
            c1.setCantidadActual(cantidadActual);
            System.out.println("No hay suficiente cafe para llenar la taza de "+tamanioTaza+"ml.La taza fue llenada con "+cantidadActual+"ml.");
            return c1.getCantidadActual();
        }   
    }
    public double vaciarCafetera(){
        Cafetera c1 = new Cafetera();
        c1.setCantidadActual(0);    
     return c1.getCantidadActual();
    }
    
    public double agregarCafe(){
        Cafetera c1 = new Cafetera();
        System.out.println("Ingrese la cantidad de cafe a agregar.");
        double cantidadCafe = leer.nextDouble();
        
     return cantidadCafe;
    }
}
