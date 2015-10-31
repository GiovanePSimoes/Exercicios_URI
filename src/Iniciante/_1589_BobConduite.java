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
public class _1589_BobConduite {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int t = teclado.nextInt();

        for (int i = 0; i < t; i++) {
            int r1 = teclado.nextInt();
            int r2 = teclado.nextInt();
            System.out.println(r1+r2);
        }
    }
}
