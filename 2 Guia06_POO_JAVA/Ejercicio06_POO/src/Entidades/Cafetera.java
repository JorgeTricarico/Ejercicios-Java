/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Notebook
 */
public class Cafetera {
    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double cantidaddActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidaddActual() {
        return cantidadActual;
    }

    public void setCantidaddActual(double cantidaddActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public double llenarCafetera(){
        cantidadActual=capacidadMaxima;
        return cantidadActual;
    }
    
    public double servirTaza(double tamanioTaza){
        if (tamanioTaza<= cantidadActual){
        
        cantidadActual-= tamanioTaza;
            System.out.println("La taza fue servida correctamente, quedan "+cantidadActual+"ml.");
            setCantidaddActual(cantidadActual);
            
        return cantidadActual;
        }else {
            cantidadActual=0;
            setCantidaddActual(cantidadActual);
            System.out.println("No hay suficiente cafe para llenar la taza de "+tamanioTaza+"ml.La taza fue llenada con "+cantidadActual+"ml.");
            return cantidadActual;
        } 
    }
    
    public double vaciarCafetera(){
        cantidadActual=0;
        return cantidadActual;
    }
    
    public double agregarCafe(int cantidadCafe){
        cantidadActual+=cantidadCafe;
        return cantidadActual;
    }
    
    public Cafetera crearCafetera(){
        return new Cafetera(2000, 0);
    }

    @Override
    public String toString() {
        return "Cafetera{" + "cantidadActual=" + cantidadActual + '}';
    }
    
    
    
}
