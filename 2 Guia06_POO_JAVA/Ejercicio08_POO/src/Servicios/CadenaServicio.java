/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
/**
 *
 * @author Notebook
 */
public class CadenaServicio {

    public void mostrarVocales(String frase, Cadena c1) {
        int cantidadVocales = 0;
        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e'
                    || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                cantidadVocales++;
            }
        }

        System.out.println("La cantidad de vocales de " + "*" + frase + "*" + " es " + cantidadVocales + ".");

    }

    public void invertirFrase(Cadena c1) {
        String frase = c1.getFrase();
        String inversa = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            inversa = inversa.concat(String.valueOf(frase.charAt(i)));
        }
        System.out.println(frase);
        System.out.println(inversa);
    }
   
    public void vecesRepetido(char letra, Cadena c1){
        String frase = c1.getFrase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
          if (frase.charAt(i)==letra) {
            contador++;
        }  
        }
        System.out.println("El caracter '"+letra+"' se repite "+contador+" veces.");
    }
    
    public void unirFrases(String frase2, Cadena c1){
        
        String frase = c1.getFrase();
        
        frase= frase.concat(frase2);
        System.out.println("Quedaria asi:");
        System.out.println("'"+frase+"'.");
    }
    
    public void remplazar(char letra,String remplazo, Cadena c1){
        
        
        String frase = c1.getFrase();
        String concat = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==letra) {
                concat= concat.concat(remplazo);
            }else{
            concat= concat.concat(String.valueOf(frase.charAt(i)));
            }
        }
        
        System.out.println(concat);
    }
    
    public void contiene(char letra, Cadena c1){
        String letra2 = String.valueOf(letra);
        String frase = c1.getFrase();
        
        System.out.println(frase.contains(letra2));
        
    
    
    }
}
