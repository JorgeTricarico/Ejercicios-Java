/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;

public class CafeteraServicio {

    public Cafetera crearCafetera() {
        
        return new Cafetera(2000, 0);
    }

    public Cafetera llenarCafetera(Cafetera c1) {
            c1.setCantidadActual(c1.getCapacidadMaxima());
        return c1; 
    }
    
    public Cafetera servirTaza(double tamanioTaza, Cafetera c1){
        double cantidadActual;
        
        cantidadActual = c1.getCantidadActual();
        System.out.println(c1);
        if (tamanioTaza<= cantidadActual){
        
        cantidadActual-= tamanioTaza;
            System.out.println("La taza fue servida correctamente, quedan "+cantidadActual+"ml.");
            c1.setCantidadActual(cantidadActual);
            
        return c1;
        }else {
            cantidadActual=0;
            c1.setCantidadActual(cantidadActual);
            System.out.println("No hay suficiente cafe para llenar la taza de "+tamanioTaza+"ml.La taza fue llenada con "+cantidadActual+"ml.");
            return c1;
        }   
    }
    public void vaciarCafetera(Cafetera c1){
        c1.setCantidadActual(0);    
    }
    
    public void agregarCafe(int cantidadCafe,Cafetera c1){
        c1.setCantidadActual(c1.getCantidadActual()+cantidadCafe);
    }
}
