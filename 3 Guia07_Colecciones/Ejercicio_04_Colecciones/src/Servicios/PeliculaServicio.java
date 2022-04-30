/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import static Entidades.Pelicula.ordenarDuracionDeMenorAMayor;
import static Entidades.Pelicula.ordenarDuracionDeMayorAMenor;
import static Entidades.Pelicula.ordenarPorDirector;
import static Entidades.Pelicula.ordenarPorTitulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Notebook
 */
public class PeliculaServicio {
    
    private ArrayList<Pelicula> listaPeliculas; // Creo la lista
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
    
    public PeliculaServicio() {
        this.listaPeliculas = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    
    public String pasarMinutosAHoraMinuto(int minutos) {
    String formato = "%02d:%02d";
    long horasReales = TimeUnit.MINUTES.toHours(minutos);
    long minutosReales = TimeUnit.MINUTES.toMinutes(minutos) - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours(minutos));
    return String.format(formato, horasReales, minutosReales);
}
    
    public void crearPelicula(){
    
        Pelicula p1 = pedirDatosPelicula();
        
        listaPeliculas.add(p1);
        
        preguntarCrearOtraPelicula();
    
    }
    
    public Pelicula pedirDatosPelicula(){
         
        System.out.println("Enter the title of the movie.");
        String titulo = leer.next().toUpperCase();
        System.out.println("Enter the name of the director of the movie.");
        String director = leer.next().toUpperCase();
        System.out.println("Enter the number of minutos the movie lasts.");
        int duracion = leer.nextInt();
    
        return new Pelicula(titulo, director, duracion);
    }
    
    public void preguntarCrearOtraPelicula(){
    
        System.out.println("Do you want to add another movie? y/n");
        String answer = leer.next().toLowerCase();
        if (answer.equals("y")) {
            
            crearPelicula();
        }
    }
    
    public void mostrarMasDe60Min(){
        System.out.println("Peliculas mayores a 60 min.\n");
        for (Pelicula peli : listaPeliculas) {
            if (peli.getDuracion()>= 60) {
                System.out.println(peli.toString());
            }
        }
    
    }
    
    public void ordenarDuracionDeMenorAMayor(){
        System.out.println("Total Peliculas de menor a mayor duracion.");
        
       Collections.sort(listaPeliculas, ordenarDuracionDeMenorAMayor);
       
       mostrarPeliculas();
    }
    
    public void ordenarDuracionDeMayorAMenor(){
        System.out.println("Total Peliculas de mayor a menor duracion.");
        
       Collections.sort(listaPeliculas, ordenarDuracionDeMayorAMenor);
       
       mostrarPeliculas();
    }
    
    public void ordenarPorTitulo(){
        System.out.println("Total peliculas por titulo alfabeticamente.");
        
       Collections.sort(listaPeliculas, ordenarPorTitulo);
       
       mostrarPeliculas();
    }
    
    public void ordenarPorDirector(){
        System.out.println("Total peliculas por director alfabeticamente.");
        
       Collections.sort(listaPeliculas, ordenarPorDirector);
       
       mostrarPeliculas();
    }
    
    public void mostrarPeliculas(){
    
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
    }
    

    @Override
    public String toString() {
        return "PeliculaServicio{" + "listaPeliculas=" + listaPeliculas + '}';
    }
    
    
    
    
}
