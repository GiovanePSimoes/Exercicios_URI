/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciante;

import java.util.Scanner;

/**
 *
 * @author giovane.psimoes
 */
public class _1534_Matriz123 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int n;
        while (teclado.hasNextInt()) {
            n = teclado.nextInt();
            int matriz[][] = new int[n][n];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.print("\n");
            }
        }
    }

}
