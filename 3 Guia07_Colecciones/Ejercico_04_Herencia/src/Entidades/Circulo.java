/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.calculosFormas;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Circulo implements calculosFormas{
    
//    public ArrayList<Circulo> listaCirculos= new ArrayList();
    private double radio,area,perimetro;
    private Scanner leer;

    public Circulo() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        area = PI*radio*radio;
        
        
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = PI*radio*2;
        
        return  perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

    
    
    
}
