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
 * @author Giovane
 */
public class _1022_TDA_Racional {

    public static void main(String args[]) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N = Integer.parseInt(in.readLine());
        int counter = 0;

        while (counter < N) {
            String linha = in.readLine();
            StringTokenizer stk = new StringTokenizer(linha);

            int n1 = Integer.parseInt(stk.nextToken());
            int d1 = Integer.parseInt(stk.nextToken("/ "));
            char operador = stk.nextToken(" ").charAt(0);
            int n2 = Integer.parseInt(stk.nextToken());
            int d2 = Integer.parseInt(stk.nextToken("/ "));

            int resultadoN = 0;
            int resultadoD = 0;

            switch (operador) {
                case '+':
                    resultadoN = (n1 * d2 + n2 * d1);
                    resultadoD = (d1 * d2);
                    break;
                case '-':
                    resultadoN = (n1 * d2) - (n2 * d1);
                    resultadoD = (d1 * d2);
                    break;
                case '*':
                    resultadoN = (n1 * n2);
                    resultadoD = (d1 * d2);
                    break;
                case '/':
                    resultadoN = (n1 * d2);
                    resultadoD = (n2 * d1);
                    break;
            }

            int mdc = mdc(resultadoN, resultadoD);
            
            if (resultadoN < 0) {
                System.out.printf("%d/%d = %d/%d\n", resultadoN, resultadoD, resultadoN / (mdc * -1), resultadoD / (mdc * -1));
            } else {
                System.out.printf("%d/%d = %d/%d\n", resultadoN, resultadoD, resultadoN / mdc, resultadoD / mdc);
            }
            counter++;
        }
    }

    public static int mdc(int a, int b) {
        int resto;

        while (b != 0) {
            resto = a % b;
            a = b;
            b = resto;
        }
        return a;

    }

}
