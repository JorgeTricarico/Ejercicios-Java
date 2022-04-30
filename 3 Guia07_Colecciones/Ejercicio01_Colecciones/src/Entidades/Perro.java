/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Notebook
 */
public class Perro {
    
    
    private String nombre;
    private ArrayList raza;

    public Perro() {
    }

    public Perro(String nombre, ArrayList raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getRaza() {
        return raza;
    }

    public void setRaza(ArrayList raza) {
        this.raza = raza;
    }
    
    

}
