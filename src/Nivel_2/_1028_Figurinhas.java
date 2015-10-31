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
public class _1028_Figurinhas {

    public static void main(String args[]) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int n = Integer.parseInt(in.readLine());
        int counter = 0;
        
        while (counter < n) {
            String linha = in.readLine();
            StringTokenizer stk = new StringTokenizer(linha);
            int f1 = Integer.parseInt(stk.nextToken());
            int f2 = Integer.parseInt(stk.nextToken());

            int result = mdc(f1, f2);
            System.out.println(result);
            
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
