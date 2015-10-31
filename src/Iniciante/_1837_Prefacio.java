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
public class _1837_Prefacio {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int a, b, q, r;
        a = teclado.nextInt();
        b = teclado.nextInt();

        q = a / b;
        r = a % b;
        
        
        
        if(b<0)
            b = b*(-1);
        
        if (r < b) {
            System.out.println(q + " " + r);
        }
    }
}
