/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Circunferencia {
    
    private float radio;
    
    //Constructor con parametros
    
    public Circunferencia(){
    }

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    // Getter
    
    public float getRadio() {
        return radio;
    }

    //Setter
    
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunsferencia(){
        
        Circunferencia c1 = new Circunferencia();
        float radio = leer.nextFloat();
        c1.setRadio(radio);
        return c1;
    }
    
   //  Método area(): para calcular el área (Area = π ∗ radio*radio). 
    
    public void area (){
        
        System.out.println("El area es: "+(Math.PI*(Math.pow(radio, 2))));
    
    }
    
    //Metodo perimetro():
    
    public void perimetro (float radio){
        System.out.println("El perimetro es: "+(2*Math.PI*radio));
    }

    
}
