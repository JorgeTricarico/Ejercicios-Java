/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class JuegoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int cantidadJugadores;
    ArrayList<Jugador> listaJugadores;
    
    
     public void decidirNumeroDeJugadores() {

        System.out.println("Ingrese la cantidad de jugadores que van a jugar");
        System.out.println("(Máximo 6 jugadores)");
        cantidadJugadores = leer.nextInt();

        if (cantidadJugadores > 6) {

            cantidadJugadores = 6;

        }

    }
     
        public ArrayList<Jugador> llenarJugadores() {

        JugadorServicio servicioJugador = new JugadorServicio();
        listaJugadores = new ArrayList();

        for (int i = 0; i < cantidadJugadores; i++) {

            System.out.println("Ingrese los datos del jugador N°" + (i + 1));
            Jugador jugadorUsuario = servicioJugador.crearJugador();

            listaJugadores.add(jugadorUsuario);

        }

        return listaJugadores;

    }
     
     
    public Juego llenarJuego(ArrayList<Jugador> cantidadJugarores, RevolverDeAgua r) {
    
        Juego j1 = new Juego(r, cantidadJugarores);
        
        return j1;
    }
    
}
