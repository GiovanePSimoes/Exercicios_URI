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
public class _1847_Inverno {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c;
        String humor = " ";

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        if ((a < b && b == c || b < c) || ((a < b && b < c) && (b - c >= a - b))
                || ((a > b && b > c) && (b - c < a - b)) || ((a == b && a < b))) {
            humor = ":)";
        } else if ((a < b && b > c || b == c) || ((a < b && b < c) && (b - c < a - b))
                || ((a < b && b < c) && (b - c >= a - b)) || ((a == b && a > b))) {
            humor = ":(";
        }else{
            humor = ":(";
        }
        System.out.println(humor);
    }
}
