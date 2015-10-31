/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author giovane.psimoes
 */
public class _1865_Mjolnir {

    public static void main(String args[]) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int T = Integer.parseInt(in.readLine());
        int i = 1;
        while (i <= T) {
            String nome = in.readLine();
            if (nome.contains("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
            i++;
        }
    }
}
