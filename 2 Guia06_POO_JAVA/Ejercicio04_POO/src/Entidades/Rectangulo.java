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
public class Rectangulo {
    
    private int base;
    
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

   
    
    
    Scanner leer = new Scanner(System.in);
    public Rectangulo crearRectangulo(){
        Rectangulo c1 = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo.");
        c1.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo.");
        c1.setAltura(leer.nextInt());
        return c1;
    }
    public int Superficie() {
        int Superficie = getBase()*getAltura();
        
        return Superficie;
    }
    
    public int Perimetro(){
        int Perimetro = (getBase()+getAltura())*2;
        return Perimetro;
    
    
    }
}
