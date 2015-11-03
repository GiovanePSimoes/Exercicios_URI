/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_2;

import java.util.Scanner;

/**
 *
 * @author Giovane
 */
public class _1091_DivisaoNlogonia {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            int k = teclado.nextInt(); // casos de teste
            if (k != 0) {
                int n = teclado.nextInt(); // divisa
                int m = teclado.nextInt(); // divisa

                for (int i = 0; i < k; i++) {
                    int x = teclado.nextInt(); // leste-oeste
                    int y = teclado.nextInt(); // norte-sul

                    if (x == n || y == m || x== m || y == n) {
                        System.out.println("divisa");
                    } else if (x>n && y >m) {
                        System.out.println("NE");
                    } else if (x<n && y>m) {
                        System.out.println("NO");
                    } else if (x<n && y<m) {
                        System.out.println("SO");
                    } else if (x>n && y<m) {
                        System.out.println("SE");
                    }
                }
            } else {
                break;
            }
        }
    }
}
