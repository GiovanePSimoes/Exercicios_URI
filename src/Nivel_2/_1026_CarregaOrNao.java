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
public class _1026_CarregaOrNao {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int a, b;

        while (teclado.hasNextInt()) {
            a = teclado.nextInt();
            b = teclado.nextInt();
            
            System.out.println(a ^ b);
            
        }
    }
}
