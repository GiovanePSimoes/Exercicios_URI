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
public class _1759_HoHoHo {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int t = teclado.nextInt();

        for (int i = 1; i <= t; i++) {
            if (i < t) {
                System.out.print("Ho ");
            }else{
                System.out.print("Ho!\n");
            }
        }
    }
}
