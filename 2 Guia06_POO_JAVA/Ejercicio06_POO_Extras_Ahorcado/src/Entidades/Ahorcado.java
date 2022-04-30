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
public class Ahorcado {

    private char[] palabra;
    public  char[] letras;
    private int cantidadLetrasEncontradas;
    private int intentos;
    

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, char[] letras, int cantidadLetrasEncontradas, int intentos) {
        this.palabra = palabra;
        this.letras = letras;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.intentos = intentos;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public char[] getLetras() {
        return letras;
    }

    public void setLetras(char[] letras) {
        this.letras = letras;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    
}
