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
public class Operacion {
    
    
    private int Numero1;
    
    private int Numero2;
    
    

    public Operacion(int numero1,int numero2) {
        this.Numero1 = numero1;
        this.Numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return Numero1;
    }

    public int getNumero2() {
        return Numero2;
    }

    public void setNumero1(int numero1) {
        this.Numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.Numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + Numero1 + ", numero2=" + Numero2 + '}';
    }
    
    Operacion crearOperacion() {
        
        Operacion o1 = new Operacion();
        //Llenar los atributos
        System.out.println("Ingrese el valor del numero 1");
        Scanner leer = new Scanner(System.in);
        o1.setNumero1(leer.nextInt());
        
        System.out.println("Ingrese el valor del numero 2");
        o1.setNumero2(leer.nextInt());
        
        return o1;
    
    }
    
    public int sumar() {
        int suma = getNumero1()+getNumero2();
        
        return suma;
    
    }
    public  int restar() {
        
        return getNumero1()-getNumero2();
    }
    public float multiplicar() {
        return getNumero1()*getNumero2();
    }
    public float dividir() {
        return getNumero1()/getNumero2();
    
    }
    
    
}
