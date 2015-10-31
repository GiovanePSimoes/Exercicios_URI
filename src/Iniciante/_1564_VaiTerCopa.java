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
public class _1564_VaiTerCopa {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int n;
        while (teclado.hasNextInt()) {
            n = teclado.nextInt();
            if(n>0){
                System.out.println("vai ter duas!");
            }else{
                System.out.println("vai ter copa!");
                
            }
        }
    }
}
