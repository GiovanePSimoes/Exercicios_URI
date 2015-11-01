/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Giovane
 */
public class _1089_LoopMusical {

    public static void main(String args[]) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int n = -1;
        while (true) {
            n = teclado.nextInt();
            if (n != 0) {
                int[] h = new int[n];
                // popula vetor
                for (int i = 0; i < n; i++) {
                    h[i] = teclado.nextInt();
                }
                System.out.println(vetorPicos(h));
            } else {
                break;
            }
        }
    }

    static int vetorPicos(int[] v) {
        int picos = 1;
        for (int i = 1; i < v.length - 1; i++) {
            if (i == 1 && ((v[i - 1] > v[i] && v[i + 1] > i) || (v[i - 1] < v[i] && v[i + 1] < v[i]) || (v[i - 1] != v[i] && v[i + 1] == v[i]) || (v[i - 1] == v[i] && v[i + 1] != v[i]))) {
                picos++;
            }
            if (i == v.length - 2 && ((v[i - 1] > v[i] && v[i + 1] > i) || (v[i - 1] < v[i] && v[i + 1] < v[i])|| (v[i - 1] != v[i] && v[i + 1] == v[i]) || (v[i - 1] == v[i] && v[i + 1] != v[i]))) {
                picos++;
            }
        }
        return picos;
    }
}
