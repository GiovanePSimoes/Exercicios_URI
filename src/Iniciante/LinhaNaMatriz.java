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
public class LinhaNaMatriz {

    public static void main(String args[]) {
        DecimalFormat df = new DecimalFormat("0.0");
        double matriz[][] = new double[12][12];
        Scanner teclado = new Scanner(System.in);
        int l = teclado.nextInt();
        char t = teclado.next().charAt(0);
        //popula matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = teclado.nextDouble();
            }
        }
        double resultado = 0;
        if (t == 'S') {
            for (int j = 0; j < matriz[0].length; j++) {
                resultado += matriz[j][l];
            }

        } else if (t == 'M') {
            for (int j = 0; j < matriz[0].length; j++) {
                resultado += matriz[j][l];
            }
            resultado = resultado / matriz[0].length;
        }

        System.out.println(df.format(resultado));
    }

}
