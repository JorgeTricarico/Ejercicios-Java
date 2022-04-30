/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25_guia1;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Ejercicio25_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la dimension de la matriz magica.");
        Scanner L = new Scanner(System.in);
        int n = L.nextInt();
        System.out.println("Ingrese la suma magica!");
        int N = L.nextInt();
        
        int[][] matriz = new int [n][n];
        
        rellenarMatriz (n,matriz);
        comprobarMatrizMagica(n, matriz, N);
        
        
        
        }
    
     public  static void rellenarMatriz(int n, int[][] matriz) {
         Scanner L = new Scanner(System.in);
         System.out.println("Ingrese una matriz magica!:");
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                  do {
                  System.out.println("Ingresa la fila "+(i+1)+". Columna "+(j+1)+". De la matriz " +n+"x"+n );
                  
                  matriz[i][j] = L.nextInt();
                  if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                      System.out.println("El numero ingresado debe estar entre 1 y 9");
                      System.out.println("");
                  }
                  } while ( matriz[i][j]<1 || matriz[i][j]>9);
            }
        }    
         
     }
     
      public  static void comprobarMatrizMagica(int n, int[][] matriz, int N) {
      
          int diagonalUno=0;
        int  diagonalDos=0;
        int auxFilas=0;
        int auxColumnas;
        
        int[] vectorFilas = new int [n];    // Si las filas y columnas suman N, los vectores estan compuestos de N.
        int[] vectorColumnas = new int [n];
        int auxVectorFilas=0;
        int auxVectorColumnas=0;
        
        
        
       
            
        for (int i = 0; i < n; i++) {
            auxFilas = 0;
            auxColumnas = 0;
            for (int j = 0; j < n; j++) {
                
                if (i==j) {
                      diagonalUno+= matriz[i][j];
                  }
                  if (i+j==n-1) {
                      diagonalDos+= matriz[i][j];
                  }
                  auxFilas+= matriz[i][j];
                  if (auxFilas == N) {
                      vectorFilas[i] = N;
                  } 
                  auxColumnas+= matriz[j][i];
                  if (auxColumnas == N) {
                  vectorColumnas[i] = N;
                  }
            }
        }    
        for (int i = 0; i < n; i++) {
           if (vectorFilas[i]== N){
            auxVectorFilas++;
           }
           if (vectorColumnas[i]== N){
            auxVectorColumnas++;
           }
        }
        if (auxVectorFilas==n && auxVectorColumnas==n && diagonalUno==N && diagonalDos==N ) {
            
            System.out.println("La matriz es magica!!! :D");
        } else {
            System.out.println("La Matriz no es magica D:");
            if (auxVectorFilas!=n) {
                System.out.println("Alguna Fila no suma " +N);
            }
            if (auxVectorColumnas!=n) {
                System.out.println("Alguna Columna no suma "+N);
            }
            if (diagonalUno!=N){
                System.out.println("La diagonal uno no suma "+N);
            }
            if (diagonalDos!=N){
                System.out.println("La diagonal 2 no suma "+N);
            
            }
        }
          
      }
    
}
     
