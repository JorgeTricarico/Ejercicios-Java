/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class AhorcadoServicio {
    Scanner leer = new Scanner(System.in);
    public Ahorcado crearJuego(){
        
        System.out.println("Ingrese la PALABRA que hay que adivinar.");
        String palabra = leer.next();
        System.out.println("Ingrese la CANTIDAD de INTENTOS.");
        int intentos = leer.nextInt();
        
        
        
        Ahorcado a1= new Ahorcado();
        a1.setIntentos(intentos);
        a1.setPalabra(palabra.toCharArray());
        
        //char[] letras = new char[a1.getPalabra().length];
        char[] letras = new char[palabra.length()];
        for(int i = 0; i < letras.length; i++){
            letras[i] = '_';
        }
        a1.setPalabra(letras);
        System.out.println(a1.getPalabra());
        //System.out.println(Arrays.toString(a1.getPalabra()));
        return a1;
    }
    
    public void longitud(Ahorcado a1){
    
        System.out.println("La longitud de la la palabra es de "
                +a1.getPalabra().length);
        System.out.println("");
        System.out.print(">    ' ");
        for (int i = 0; i < a1.getPalabra().length; i++) {
            System.out.print("_ ");
        }
        System.out.println("'");
    }
    
    public char buscar( Ahorcado a1){
        char letra;
        System.out.println("Ingrese la letra que decia buscar");
        letra = leer.next().charAt(0);
        char [] palabra = a1.getPalabra();
        System.out.println("");
        char [] letras = a1.getLetras();
        for(int i = 0; i < a1.getLetras().length; i++){
                if(palabra[i]==letra){
                    letras[i] = palabra[i];
                }
            }
        a1.setLetras(letras);
        
       /* System.out.println("");
        System.out.print(">             ");
        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (a1.getPalabra()[i] == letra ) {
                    System.out.print(letra+" ");
                }else {
                System.out.print("_ ");
            }
               // System.out.println("La letra fue encontrada en la posicion "+(i+1)+
                        //" de "+a1.getPalabra().length);
                
         
                   */
             
        
        System.out.println("\n");
        return letra;
    }
    
    public boolean encontradas(char letra, Ahorcado a1){
        int cantidadLetras = a1.getPalabra().length;
        int encontradas=0;
        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (a1.getPalabra()[i] == letra) {
                encontradas++;
                }
            }
            if (encontradas>0) {
                System.out.println("Se encontraron "+encontradas+" '"+letra+"'"+
                    " y restan "+(cantidadLetras-encontradas+" letras."));
                System.out.println("Te quedan "+a1.getIntentos()+" intentos.");
                return true;
        } else {
                System.out.println("Incorrecto!!! >_<");
            intentos(a1);
        return false;
            }
        
    }
    
    public void intentos(Ahorcado a1){
    
        a1.setIntentos(a1.getIntentos()-1);
        System.out.println("Te quedan "+a1.getIntentos()+" intentos.");
    }
}
