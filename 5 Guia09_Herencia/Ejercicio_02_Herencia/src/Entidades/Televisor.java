/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Notebook
 */
public class Televisor extends Electrodomestico{
    
    protected Integer pulgadas;
    
    protected boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer pulgadas, boolean sintonizadorTDT, double precio, String color, char consumoElectrico, double peso) {
        super(precio, color, consumoElectrico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    @Override
    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    
    
}
