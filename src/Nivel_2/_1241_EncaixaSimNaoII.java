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
public class _1241_EncaixaSimNaoII {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        String a, b;

        for (int i = 0; i < n; i++) {
            a = teclado.next();
            b = teclado.next();
            encaixaSN(a, b);
        }
    }

    static void encaixaSN(String s1, String s2) {
        int endIndexS2 = s2.length();
        int beginIndexS1 = s1.length() - s2.length();
        int endIndexS1 = s1.length();
        if (s1.length() >= s2.length() && (s2.substring(0, endIndexS2).contains(s1.substring(beginIndexS1, endIndexS1)))) {
            System.out.println("encaixa");
        } else {
            System.out.println("nao encaixa");
        }
    }
}
