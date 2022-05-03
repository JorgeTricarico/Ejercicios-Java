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
public class Lavarropa extends Electrodomestico {
    protected Integer carga;
    
    public Lavarropa(){
        
    }

    public Lavarropa(Integer carga) {
        this.carga = carga;
    }

    public Lavarropa(Integer carga, Integer precio, String color, char consumoElectrico, Integer peso) {
        super(precio, color, consumoElectrico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(Integer precio) {
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
    public Integer getPeso() {
        return peso;
    }

    @Override
    public void setPeso(Integer peso) {
        this.peso = peso;
    }

//    @Override
//    public String toString() {
//        return "carga=" + carga + '}';
//    }

    @Override
    public String toString() {
        return "Lavarropas" +'{' + "precio=" + precio + ", color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso+'}';
    }

    
    
   

    
    
    
    
}
