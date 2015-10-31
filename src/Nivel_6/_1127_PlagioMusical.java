/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_6;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Giovane
 */
class _1127_PlagioMusical {

    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int M, T, comp1, comp2, counter = 0;
        String Music1, Music2;

        while (true) {
            M = in.nextInt();
            T = in.nextInt();

            if (M == 0 && T == 0) {
                break;
            } else {
                //input da musica 1
                int[] intMusica1 = new int[M];
                for (int i = 0; i < M; i++) {
                    Music1 = in.next();

                    switch (Music1.charAt(0)) {
                        case 'A':
                            intMusica1[i] = 1;
                            break;
                        case 'B':
                            intMusica1[i] = 3;
                            break;
                        case 'C':
                            intMusica1[i] = 4;
                            break;
                        case 'D':
                            intMusica1[i] = 6;
                            break;
                        case 'E':
                            intMusica1[i] = 8;
                            break;
                        case 'F':
                            intMusica1[i] = 9;
                            break;
                        case 'G':
                            intMusica1[i] = 11;
                            break;
                    }

                    if (Music1.length() > 1) {
                        if (Music1.charAt(1) == '#') {
                            intMusica1[i]++;
                        } else if (Music1.charAt(1) == 'b') {
                            intMusica1[i]--;
                        }
                    }
                }

                //input da musica 2
                int[] intMusica2 = new int[T];
                for (int i = 0; i < T; i++) {
                    Music2 = in.next();
                    switch (Music2.charAt(0)) {
                        case 'A':
                            intMusica2[i] = 1;
                            break;
                        case 'B':
                            intMusica2[i] = 3;
                            break;
                        case 'C':
                            intMusica2[i] = 4;
                            break;
                        case 'D':
                            intMusica2[i] = 6;
                            break;
                        case 'E':
                            intMusica2[i] = 8;
                            break;
                        case 'F':
                            intMusica2[i] = 9;
                            break;
                        case 'G':
                            intMusica2[i] = 11;
                            break;
                    }

                    if (Music2.length() > 1) {
                        if (Music2.charAt(1) == '#') {
                            intMusica2[i]++;
                        } else if (Music2.charAt(1) == 'b') {
                            intMusica2[i]--;
                        }
                    }
                }
                int j = 0;

                for (int i = 0; i < ((M - 1) - (T - 2)); i++) {
                    for (j = 0; j < (T - 1);) {
                        comp1 = intMusica1[j + i + 1] - intMusica1[j + i];
                        if (comp1 < 0) {
                            comp1 += 12;
                         
                        }
                        comp2 = intMusica2[j + 1] - intMusica2[j];
                        if (comp2 < 0) {
                            comp2 += 12;
                            
                        }

                        if (counter < (T - 1)) {
                            if (comp1 == comp2) {
                                counter++;
                            } else {
                                counter = 0;
                                break;
                            }
                        } else {
                            break;
                        }
                        j++;
                    }
                    if (counter == (T - 1)) {
                        break;
                    }
                    if (j > 0) {
                        i += --j;
                    }
                }

                // imprimir vetor
                if (counter == (T - 1)) {
                    System.out.printf("S\n");
                } else {
                    System.out.printf("N\n");
                }
                counter = 0;
            }
        }
    }

}
