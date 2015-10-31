/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_3;

import java.util.Scanner;

/**
 *
 * @author Giovane
 */
public class _1030_LendaFlaviousJosephus {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        //recurs
        //f(n, k) onde "n" é o número de pessoas e o "k" é o salto
        //f(1, k) = 1 caso base
        //f(n, k) = (f(n - 1, k) + k -1) % n + 1
        int nc = in.nextInt();
        int n, k, vivo;
        for (int i = 0; i < nc; i++) {
            n = in.nextInt();
            k = in.nextInt();
            System.out.printf("Case %d: %f\n", i + 1, (int)josephus(n, k));
        }
    }

    static double josephus(int n, int k) {
        if (n == 1) {
            return 1;
        }
            return (josephus(n - 1, k) + k - 1) % n + 1;
        
    }
}
