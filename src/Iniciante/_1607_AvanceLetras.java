/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciante;

import java.util.Scanner;

/**
 *
 * @author Giovane
 */
public class _1607_AvanceLetras {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int t = teclado.nextInt();

        for (int i = 0; i < t; i++) {
            String a = teclado.next();
            String b = teclado.next();
            System.out.println(avancaLetras(a, b));
        }
    }

    static int avancaLetras(String a, String b) {
        int passos = 0;
        boolean negativo = false;
        for (int i = 0; i < a.length(); i++) {
            int charA = a.charAt(i);
            int charB = b.charAt(i);

            if (charA < charB) {
                passos += charB - charA;
            } else if (charA > charB) {
                passos += charB - charA;
                negativo = true;
            }
        }
        if (negativo) {
            return passos+26;
        } else {
            return passos;
        }
    }
}
