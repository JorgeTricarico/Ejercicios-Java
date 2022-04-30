/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author Notebook
 */
public class Pelicula {
    
    private String titulo;
    
    private String director;
    
    private Integer duracion;

     public static Comparator<Pelicula> ordenarDuracionDeMenorAMayor= new Comparator<Pelicula>() { 
           @Override 
           public int compare(Pelicula p1, Pelicula p2) { 
           return p1.getDuracion().compareTo(p2.getDuracion());
        } 
    };
     
     public static Comparator<Pelicula> ordenarDuracionDeMayorAMenor= new Comparator<Pelicula>() { 
           @Override 
           public int compare(Pelicula p1, Pelicula p2) { 
           return p2.getDuracion().compareTo(p1.getDuracion());
        } 
    };
     
     public static Comparator<Pelicula> ordenarPorTitulo= new Comparator<Pelicula>() { 
           @Override 
           public int compare(Pelicula p1, Pelicula p2) { 
           return p1.getTitulo().compareTo(p2.getTitulo());
        } 
    };
     
     public static Comparator<Pelicula> ordenarPorDirector= new Comparator<Pelicula>() { 
           @Override 
           public int compare(Pelicula p1, Pelicula p2) { 
           return p1.getDirector().compareTo(p2.getDirector());
        } 
    };
    
    public Pelicula() {
    }

    public Pelicula(String tituto, String director, int duracion) {
        this.titulo = tituto;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titutlo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula: " + "titutlo=" + titulo + ", director=" + director + ", duracion=" + duracion;
    }
    
    
}
