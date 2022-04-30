/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeraciones.RazaPerro;

/**
 *
 * @author Notebook
 */
public class Perro {
    
    private String nombre, tamanio;
    
    private RazaPerro raza;
    
    private Integer edad;

    public Perro() {
    }

    public Perro(String nombre, String tamanio, RazaPerro raza, Integer edad) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public RazaPerro getRaza() {
        return raza;
    }

    public void setRaza(RazaPerro raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", tamanio=" + tamanio + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    

}
