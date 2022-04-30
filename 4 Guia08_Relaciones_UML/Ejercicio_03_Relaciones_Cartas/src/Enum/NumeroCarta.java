/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author Notebook
 */
public enum NumeroCarta {
    
    UNO,DOS,TRES,CUATRO,CINCO,SEIS,SIETE,DIEZ,ONCE,DOCE;
    
    private Integer numero;

    private NumeroCarta() {
    }

    private NumeroCarta(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

}

