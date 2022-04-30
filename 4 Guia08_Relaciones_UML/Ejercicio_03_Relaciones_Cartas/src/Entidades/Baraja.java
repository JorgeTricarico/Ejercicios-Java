/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Objects;


/**
 *
 * @author Notebook
 */
public class Baraja {
    
    private ArrayList<Carta> Carta;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> Carta) {
        this.Carta = Carta;
    }

    public ArrayList<Carta> getCarta() {
        return Carta;
    }

    public void setCarta(ArrayList<Carta> Carta) {
        this.Carta = Carta;
    }

    @Override
    public String toString() {
        return "Baraja{" + "Carta=" + Carta + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.Carta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Baraja other = (Baraja) obj;
        if (!Objects.equals(this.Carta, other.Carta)) {
            return false;
        }
        return true;
    }
   
    

   

    
    
    
    
}
