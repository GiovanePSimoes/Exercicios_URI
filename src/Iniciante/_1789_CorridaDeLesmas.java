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
public class _1789_CorridaDeLesmas {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        while (teclado.hasNextInt()) {
            int l = teclado.nextInt();
            int vetor[] = new int[l];
            int maior = 0;

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = teclado.nextInt();

                if (vetor[i] > vetor[maior]) {
                    maior = i;
                }
            }
            if (vetor[maior] < 10) {
                System.out.println("1");
            } else if (vetor[maior] >= 10 && vetor[maior] < 20) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }

        }
    }
}
