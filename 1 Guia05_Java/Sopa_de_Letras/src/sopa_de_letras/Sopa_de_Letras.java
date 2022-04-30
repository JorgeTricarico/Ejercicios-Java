/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopa_de_letras;


import java.util.Random;
import java.util.Scanner;

public class Sopa_de_Letras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        String [] palabras = new String[5];    
        String[][] sopaDeLetras = new String[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopaDeLetras[i][j] = "";
            }
        }
        
         System.out.println("A continuacion tendra que ingresar 5 palabras. \n------------------------------->\n"
                + "Cada palabra tiene que tener entre 3 y 5 caracteres.");
         for (int i = 0; i < palabras.length; i++) {
            do {
             System.out.println(">>>>>>>\nIngrese la palabra numero "+(i+1)+".");
            palabras[i]= leer.next().toUpperCase();
                if (palabras[i].length()<3 || palabras[i].length()>5) {
                    System.out.println("Error!\nLa palabra tiene que tener entre 3 y 5 caracteres.\nVuelva a intentarlo.");
                }
            } while (palabras[i].length()<3 || palabras[i].length()>5);
            
            
        }
        
        for (int i = 0; i < palabras.length; i++) {
            
            
           String palabra = palabras[i];
           int fila;
           int columna;
           do {
                fila = random.nextInt(20);
                columna =random.nextInt(15);
                
                
            } while ((!(sopaDeLetras[fila][columna].isEmpty())) && (!(sopaDeLetras[fila][columna+5].isEmpty())));
            
           
            
            for (int j = 0; j < palabras[i].length(); j++) { // aca no se porque me da error si pongo 5.
                String letra = String.valueOf(palabra.charAt(j));
                sopaDeLetras[fila][columna+j]= letra+"_"; // para ver las palabras.
            }
        }for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if ("".equals(sopaDeLetras[i][j])) {
                    char caracterRandom = (char) (random.nextInt(26) + 'A');
                    sopaDeLetras[i][j] = String.valueOf(caracterRandom)+" ";
                    
                }
                
            }
        }
        
            
        
         for (String letra[] : sopaDeLetras) {
            System.out.println("");
            for (String letra2 : letra) 
                 System.out.print(letra2);
            }
            System.out.println("\n");
    }

}