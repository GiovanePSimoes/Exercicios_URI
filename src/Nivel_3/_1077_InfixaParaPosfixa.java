/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_3;

import java.util.Scanner;

/**
 *
 * @author giovane.psimoes
 */
public class _1077_InfixaParaPosfixa {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String n;

        String[] vet = new String[10];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = teclado.next(); 
            
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
            
        }
        
    }
}
