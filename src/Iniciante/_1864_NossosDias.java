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
public class _1864_NossosDias {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        int n = teclado.nextInt();
        
        System.out.println(frase.substring(0, n));
        
    }
}
