/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes;

/**
 *
 * @author Notebook
 */
public abstract class Electrodomestico {
    
    protected Integer precio;
    protected String color;
    protected char consumoElectrico;
    protected Integer peso;
    
    
    
    public Electrodomestico() {
        
    }

    public Electrodomestico(Integer precio, String color, char consumoElectrico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
        
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

//    @Override
//    public String toString() {
//        return "" + "precio=" + precio + ", color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso;
//    }

    
    
   
}
