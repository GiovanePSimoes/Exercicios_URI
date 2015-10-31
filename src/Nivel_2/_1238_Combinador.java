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
public class _1238_Combinador {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        String palavra1, palavra2, combinada = "";

        for (int i = 0; i < n; i++) {
            palavra1 = teclado.next();
            palavra2 = teclado.next();
            combinada = combinada(palavra1,palavra2);
            System.out.println(combinada);
        }
    }

    static String combinada(String st1, String st2) {
        String combinada = "";
        int maior = stringMaior(st1, st2);
        int counter = 0;

        for (int i = 0; i < maior; i++) {
            if (i < st1.length()) {
                combinada += st1.charAt(i);
            }
            if (i < st2.length()) {
                combinada += st2.charAt(i);
            }
        }

        return combinada;
    }

    static int stringMaior(String st1, String st2) {
        int maior;
        if (st1.length() > st2.length()) {
            maior = st1.length();
        } else {
            maior = st2.length();
        }
        return maior;
    }
}
