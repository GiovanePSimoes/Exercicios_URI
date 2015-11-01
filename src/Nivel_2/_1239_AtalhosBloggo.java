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
public class _1239_AtalhosBloggo {

    public static void main(String args[]) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String texto;

        while (teclado.hasNext()) {
            texto = teclado.nextLine();
            System.out.println(converteTexto(texto));
        }
    }

    static StringBuilder converteTexto(String texto) {
        int tag = 1;
        int tag2 = 1;
        StringBuilder t = new StringBuilder();
        t.append(texto);

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '*') {
                if (tag == 1) {
                    t.replace(i, i + 1, "<b>");
                    tag = 2;
                } else {
                    t.replace(i, i + 1, "</b>");
                    tag = 1;
                }
            }
            
            if (t.charAt(i) == '_') {
                if (tag2 == 1) {
                    t.replace(i, i + 1, "<i>");
                    tag2 = 2;
                } else {
                    t.replace(i, i + 1, "</i>");
                    tag2 = 1;
                }
            }
        }
        return t;
    }
}
