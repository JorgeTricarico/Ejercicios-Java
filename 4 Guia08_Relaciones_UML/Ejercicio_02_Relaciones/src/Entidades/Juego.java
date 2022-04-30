/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;

/**
 *
 * @author Notebook
 */
public class Juego {
    
    private RevolverDeAgua r;
    private List<Jugador> jugadores;

    public Juego() {
    }

    public Juego(RevolverDeAgua r, List<Jugador> jugadores) {
        this.r = r;
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getR() {
        return r;
    }

    public void setR(RevolverDeAgua r) {
        this.r = r;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
    
}
