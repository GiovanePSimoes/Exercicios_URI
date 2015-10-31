/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_2;

import java.util.Scanner;

/**
 *
 * @author giovane.psimoes
 */
public class _1171_FrequenciaNumeros {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        int[] x = new int[N];
        int counter;
        int matrizCounter = 0;

        for (int i = 0; i < N; i++) {
            x[i] = teclado.nextInt();
        }

        //descobrindo quantos numeros independentes e add no novo vetor
        Integer matriz[][] = new Integer[2][N];
        for (int i = 0; i < N; i++) {
            counter = 0;
            for (int j = 0; j < N; j++) {
                if (x[i] == x[j]) {
                    counter++;
                    matriz[0][matrizCounter] = x[i];
                    matriz[1][matrizCounter] = counter;
                }
            }
            matrizCounter++;
        }

        //ordenando a matriz
        int aux1 = 0, aux2 = 0;
        for (int i = 0; i < matriz[0].length - 1; i++) {
            for (int j = 0; j < matriz[0].length - i - 1; j++) {
                if (matriz[0][j] > matriz[0][j + 1]) {
                    aux1 = matriz[0][j];
                    matriz[0][j] = matriz[0][j + 1];
                    matriz[0][j + 1] = aux1;

                    aux2 = matriz[1][j];
                    matriz[1][j] = matriz[1][j + 1];
                    matriz[1][j + 1] = aux2;
                }
            }
        }

        System.out.printf("%d aparece %d vez(es)\n", matriz[0][0], matriz[1][0]);
        
        for (int i = 0; i < matriz[0].length; i++) {
            boolean imprime = true;
            for (int j = matriz[0].length - 1; j >= i; j--) {
                if (matriz[0][i] == matriz[0][j]) {
                    if (j == matriz[0].length - 1) {
                        imprime = false;
                        break;
                    }
                    i = j + 1;
                }
            }
            if (imprime == true) {
                System.out.printf("%d aparece %d vez(es)\n", matriz[0][i], matriz[1][i]);
            }
        }
        

    }

}
