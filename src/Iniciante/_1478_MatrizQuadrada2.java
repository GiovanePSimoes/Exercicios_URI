/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Giovane
 */
public class _1478_MatrizQuadrada2 {

    public static void main(String args[]) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N = -1;
        while (N != 0) {
            N = Integer.parseInt(in.readLine());
            int matriz[][] = new int[N][N];
            populaMatriz(matriz);
            imprimeMatriz(matriz);
        }
    }

    static void populaMatriz(int[][] M) {
        int fim = M.length - 1;
        int inicio = 0;
        int contador = 1;
        int metade = (0 + M.length - 1) / 2;

        for (int i = 0; i <= fim; i++) {
            for (int j = 0; j <= fim; j++) {
//                if (j + i <= fim) {
                    M[inicio+i][j] = contador;
                    M[j][inicio+i] = contador;
                    M[fim][fim-j] = contador;
//                }
            }
            fim--;
            contador++;
        }
    }

    static void imprimeMatriz(int[][] M) {
        int align = 4;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (j == 0) {
                    System.out.printf("%" + (align - 1) + "d", M[i][j]);
                } else {
                    System.out.printf("%" + align + "d", M[i][j]);
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
