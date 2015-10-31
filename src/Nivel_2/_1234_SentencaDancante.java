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
public class _1234_SentencaDancante {

    public static void main(String args[]) throws IOException {
        Scanner teclado = new Scanner(System.in);

        while (teclado.hasNext()) {
            String sentenca = teclado.nextLine();
            sentenca = dancante(sentenca);
            System.out.println(sentenca);
        }
        
    }

    static String dancante(String frase) {
        String novaFrase = "";
        boolean caseAtual = true;

        for (int i = 0; i < frase.length(); i++) {
            if (caseAtual) {
                novaFrase += Character.toUpperCase(frase.charAt(i));
            } else {
                novaFrase += Character.toLowerCase(frase.charAt(i));
            }
            if (frase.charAt(i) != ' ') {
                caseAtual = !caseAtual;
            }
        }

        return novaFrase;
    }
}
