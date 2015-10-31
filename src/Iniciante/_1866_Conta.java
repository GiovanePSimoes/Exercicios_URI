/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author giovane.psimoes
 */
public class _1866_Conta {

    public static void main(String args[]) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int c = Integer.parseInt(in.readLine());
        int resultado;

        for (int i = 0; i < c; i++) {
            int n = Integer.parseInt(in.readLine());
            resultado = -1;

            for (int j = 0; j < n; j++) {
                resultado = resultado * (-1);
            }
            if (resultado > 0) {
                System.out.println(resultado);
            }else{
                System.out.println("0");
            }
        }

    }
}
