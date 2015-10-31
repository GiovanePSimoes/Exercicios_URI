/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aquecimento;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author giovane.psimoes
 */
public class _1010_CalculoSimples {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int codP1, codP2, nP1, nP2;
        double valorP1, valorP2;

        codP1 = teclado.nextInt();
        nP1 = teclado.nextInt();
        valorP1 = teclado.nextDouble();
        codP2 = teclado.nextInt();
        nP2 = teclado.nextInt();
        valorP2 = teclado.nextDouble();
        
        double soma = (valorP1 * nP1) + (valorP2 * nP2);
        
        System.out.println("VALOR A PAGAR: R$ "+df.format(soma));
    }

}
