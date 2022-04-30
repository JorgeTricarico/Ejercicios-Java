/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_poo;

import java.util.Arrays;

/**
 *
 * @author Notebook
 */
public class Ejercicio10_Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] a = new double[50];
        double[] b = new double[20];

        for (int i = 0; i < 50; i++) {
            double resto = i % 10;
            if (i == 0) {

                a[i] = (Math.round(Math.random() * 100.0) / 100.0);
                System.out.print(a[i] + " ");
            } else if (resto == 0) {
                System.out.println("");
                a[i] = (Math.round(Math.random() * 100.0) / 100.0);
                System.out.print(a[i] + " ");
                System.out.print("");
            } else {
                a[i] = (Math.round(Math.random() * 100.0) / 100.0);
                System.out.print(a[i] + " ");

            }
        }

        System.out.println("");
        System.out.println("");
        Arrays.sort(a);

        System.out.println("");
        for (int i = 0; i < 20; i++) {
            if (i > 9) {
                b[i] = 0.5;
            } else {
                b[i] = a[i];
            }

        }

        for (int i = 0; i < 20; i++) {
            double resto = i % 10;
            if (i == 0) {

                System.out.print(b[i] + " ");
            } else if (resto == 0) {
                System.out.println("");

                System.out.print(b[i] + " ");
                System.out.print("");
            } else {

                System.out.print(b[i] + " ");

            }

        }
        System.out.println("");
    }

}
