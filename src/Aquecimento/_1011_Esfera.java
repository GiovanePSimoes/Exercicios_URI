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
public class _1011_Esfera {

    public static void main(String args[]) {
        double r;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        r = teclado.nextDouble();
        double vol = volume(r);
        System.out.println("VOLUME = " + df.format(vol));
    }

    static double volume(double r) {
        final double PI = 3.14159;
        return (4 / 3.0) * PI * Math.pow(r, 3);
    }
}
