/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciante;

import java.util.Scanner;

/**
 *
 * @author Giovane
 */
public class _1836_Pokemon {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int b, iv;
        double ev;

        int t = teclado.nextInt();

        for (int i = 0; i < t; i++) {
            String nome = teclado.next();
            int l = teclado.nextInt();

            b = teclado.nextInt();
            iv = teclado.nextInt();
            ev = teclado.nextInt();
            int hp = (int) ((((iv + b + (Math.sqrt(ev) / 8) + 50) * l) / 50) + 10);

            b = teclado.nextInt();
            iv = teclado.nextInt();
            ev = teclado.nextInt();
            int at = (int) ((((iv + b + (Math.sqrt(ev) / 8)) * l) / 50) + 5);

            b = teclado.nextInt();
            iv = teclado.nextInt();
            ev = teclado.nextInt();
            int df = (int) ((((iv + b + (Math.sqrt(ev) / 8)) * l) / 50) + 5);

            b = teclado.nextInt();
            iv = teclado.nextInt();
            ev = teclado.nextInt();
            int sp = (int) ((((iv + b + (Math.sqrt(ev) / 8)) * l) / 50) + 5);

            System.out.printf("Caso #%d: %s nivel %d\n", i+1, nome, l);
            System.out.println("HP: " + hp);
            System.out.println("AT: " + at);
            System.out.println("DF: " + df);
            System.out.println("SP: " + sp);
        }
    }
}
