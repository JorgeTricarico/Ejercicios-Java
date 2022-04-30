/*
 * To change this license header, choose License Headers in Project Properties.         
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26_guia1;

import java.util.Arrays;

/**
 *
 * @author Notebook
 */
public class Ejercicio26_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int [][] matrizDos = {{6,7,8},{7,8,9},{8,9,10}};
        int aux=0;
        int fila=0;
        int columna=0;
                
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j]= i+j;
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matriz[i][j]==matrizDos[0][0]) {
                    fila = i;
                    columna = j;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matriz[k+i][l+j]==matrizDos[k][l]){
                                aux++;
                            }
                        }
                    }
                }       
            }
        }
       
        if (aux==9){
            System.out.println("El primer componte de la matriz de 3x3 dentro de la de 10x10, se encuentra en la fila "+fila+" y en la columna "+columna+".");
        } else if (aux>=9){
            System.out.println("El primer componte de la matriz de 3x3 dentro de la de 10x10, se encuentra en la fila "+fila+" y en la columna "+columna+".");
            System.out.println("Pero ademas podemos encontrar " +(aux/9)+ " matrices como esa en la matriz de 10x10.");
        }
        
        for(int i[]: matriz) {
            System.out.println("");
            for (int j:i){
                if (j<10) {
                System.out.print(+j+ "  ");
                } else {
                    System.out.print(j+ " ");
                }
                
        }
        }    
    }
    //Funciones
}
