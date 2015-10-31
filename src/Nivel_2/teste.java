/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Giovane
 */
public class teste {

    public static void main(String args[]) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N = Integer.parseInt(in.readLine());
        int counter = 0;

        while (counter < N) {
            String frase = in.readLine();
            //1a passada
//            for (int i = 0; i < frase.length(); i++) {
//                char c = ' ';
//                if (frase.charAt(i) != ' ' && (frase.charAt(i) > 64 && frase.charAt(i) < 91 || frase.charAt(i) > 96 && frase.charAt(i) < 123)) {
//                    int cod = (int) frase.charAt(i); //Converte cada letra em Int
//                    //Decodificação
//                    cod += 3;
//                    c = (char) cod; //Transforma o Inteiro de volta pra char
//                } else {
//                    c = frase.charAt(i);
//                }
//                frase += c; //Substitui a letra atual pelo char codificado
//            }
            //2a passada
//            String fraseInvertida = "";
//            for (int i = frase.length() - 1; i >= 0; i--) {
//                fraseInvertida += frase.charAt(i);
//            }
//            frase = fraseInvertida;
            //3a passada
//            int inicio = 0;
//            int fim = frase.length() - 2;
//            int meio = (inicio + fim) / 2;
//
//            for (int i = 0; i < frase.length(); i++) {
//                char c = ' ';
//                if (frase.charAt(i) != ' ' && i > meio) {
//                    int cod = (int) frase.charAt(i); //Converte cada letra em Int
//                    //Decodificação
//                    cod -= 1;
//                    c = (char) cod; //Transforma o Inteiro de volta pra char
//                    frase += c; //Substitui a letra atual pelo char codificado
//                } else {
//                    c = frase.charAt(i);
//                    frase += c;
//                }
//
//            }

            System.out.println(frase);
            counter++;
        }
    }

}
