/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aquecimento;

import java.util.Scanner;

/**
 *
 * @author giovane.psimoes
 */
public class _1013_oMaior {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        int maiorAB = oMaior(a, b);
        int maiorABC = oMaior(maiorAB, c);
        System.out.println(maiorABC + " eh o maior");
    }

    static int oMaior(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }
}
