/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Giovane
 */
public class _1235_DentroParaFora {

    public static void main(String args[]) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int n = Integer.parseInt(in.readLine());
        int counter = 0;
        while (counter < n) {
            String frase = in.readLine();
            System.out.println(decifrador(frase)); 
            counter++;
        }
    }

    static String decifrador(String frase) {
        String fraseDecifrada = "";
        int i = (frase.length()-1) / 2;

        for (int j = 0; j < frase.length(); j++) {
            fraseDecifrada += frase.charAt(i);
            if (i == 0) {
                i = frase.length() - 1;
            } else {
                i--;
            }
        }

        return fraseDecifrada;
    }
}
