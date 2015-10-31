/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author giovane.psimoes
 */
public class _1160_CrescimentoPop {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(ir);

        int nTestes;
        nTestes = Integer.parseInt(teclado.readLine());
        int pA, pB;
        float g1, g2;

        for (int i = 0; i < nTestes; i++) {
            String linha = teclado.readLine();
            StringTokenizer stk = new StringTokenizer(linha);

            pA = Integer.parseInt(stk.nextToken());
            pB = Integer.parseInt(stk.nextToken());
            g1 = Float.parseFloat(stk.nextToken());
            g2 = Float.parseFloat(stk.nextToken());
            int anos = 0;

            while (pA <= pB) {
                if (anos <= 100) {
                    pA = (int) (pA + (pA / 100 * g1));
                    pB = (int) (pB + (pB / 100 * g2));
                    anos++;

                } else {
                    System.out.printf("Mais de 1 seculo.\n");
                    break;
                }
            }

            if (anos <= 100) {
                System.out.printf("%d anos.\n", anos);
            }

        }
    }

}
