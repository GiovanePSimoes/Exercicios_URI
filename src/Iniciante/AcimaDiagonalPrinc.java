/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author giovane.psimoes
 */
public class AcimaDiagonalPrinc {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String args[]) {

        DecimalFormat df = new DecimalFormat("0.0");
        double matriz[][] = new double[12][12];

        char O = teclado.next().charAt(0);
        populaMatriz(matriz);
        double soma = soma(matriz);
        double media = soma / media(matriz);

        if (O == 'S') {
            System.out.println(df.format(soma));
        } else if (O == 'M') {
            System.out.println(df.format(media));
        }

    }

    static double media(double matriz[][]) {
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j > i) {
                    contador++;
                }
            }
        }

        return contador;
    }

    static double soma(double matriz[][]) {
        double soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j > i) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    static void populaMatriz(double matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = teclado.nextDouble();
            }
        }
    }
}
