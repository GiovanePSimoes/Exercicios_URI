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
 * @author giovane.psimoes
 */
public class _1110_JogandoCartasFora {

    static int n = -1;

    public static void main(String args[]) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (true) {
            n = Integer.parseInt(in.readLine());
            int listaCartas[] = new int[n];
            int[] discarded = new int[n - 1];

            if (n != 0) {
                populaVetor(listaCartas);
                descarte(listaCartas, discarded);
                exibir(listaCartas, discarded);
            } else {
                break;
            }
        }

    }

    static void populaVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }
    }

    static void descarte(int[] vetor, int[] discarded) {
        int counter = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            discarded[counter] = vetor[0];

            for (int j = 0; j < vetor.length - 1; j++) {
                vetor[j] = vetor[j + 1];
            }

            vetor[vetor.length - 2 - i] = vetor[0];
            vetor[vetor.length - 1 - i] = 0;
            counter++;
        }

    }

    static void exibir(int[] vetor, int[] discarded) {
        System.out.print("Discarded cards: ");

        for (int i = 0; i < discarded.length; i++) {

            System.out.print(discarded[i] + " ");
        }
        System.out.println("");

        System.out.print("Remaining cards: " + vetor[0]);

    }

}
