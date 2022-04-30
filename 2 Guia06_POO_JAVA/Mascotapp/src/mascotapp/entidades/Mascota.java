/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

/**
 *
 * @author Notebook
 */
public class Mascota {

    public String nombre;
    public String apodo;

    //Conejo, Gato, Perro, Loro, Carpincho
    public String tipos;
    public String color;
    public int edad;
    public boolean cola;
    public String raza;
    private String tipo;

    private int energia;

    public Mascota() {
        energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;

        this.energia = 1000;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int pasear(int energiaRestar) {
        
        energia -= energiaRestar;
        return energia;

    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipos=" + tipos + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", tipo=" + tipo + ", energia=" + energia + '}';
    }

    
}
