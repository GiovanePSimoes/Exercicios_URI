/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author giovane.psimoes
 */
public class _1025_OndeEstaMarmore {

    public static void main(String args[]) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int casosTeste = 1;
        int nMarmores = -1; //Numero de Marmores 
        int qConsultas = -1; //Numero de  Consultas

        while (casosTeste < 65) {

            String entrada = in.readLine();
            StringTokenizer tk = new StringTokenizer(entrada);

            nMarmores = Integer.parseInt(tk.nextToken());
            qConsultas = Integer.parseInt(tk.nextToken(" "));
            
            if (nMarmores != 0 && qConsultas != 0) {
                int[] marmores = new int[nMarmores];
                for (int i = 0; i < marmores.length; i++) {
                    marmores[i] = Integer.parseInt(in.readLine());
                }

                //Ordenando os marmores
                for (int i = 0; i < marmores.length - 1; i++) {
                    int index = i;
                    for (int j = i + 1; j < marmores.length; j++) {
                        if (marmores[j] < marmores[index]) {
                            index = j;
                        }
                    }

                    int smallerNumber = marmores[index];
                    marmores[index] = marmores[i];
                    marmores[i] = smallerNumber;
                }

                int[] consultas = new int[qConsultas];
                for (int i = 0; i < qConsultas; i++) {
                    consultas[i] = Integer.parseInt(in.readLine());
                }
                System.out.printf("CASE# %d:\n", casosTeste);

                for (int i = 0; i < qConsultas; i++) {
                    int aux = -1;

                    for (int j = 0; j < nMarmores; j++) {
                        if (consultas[i] == marmores[j]) {
                            aux = j + 1;
                            break;
                        }
                    }
                    if (aux > -1) {
                        System.out.printf("%d found at %d\n", consultas[i], aux);
                    } else {
                        System.out.printf("%d not found\n", consultas[i]);
                    }
                }

                casosTeste++;
            } else {
                break;

            }
        }

    }
}
