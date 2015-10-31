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
 *
 * @author giovane.psimoes
 */
public class _1012_Area {

    public static void main(String args[]) {
        double a, b, c;
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        System.out.println("TRIANGULO: " + df.format(areaTriangulo(a, c)));
        System.out.println("CIRCULO: " + df.format(areaCirculo(c)));
        System.out.println("TRAPEZIO: " + df.format(areaTrapezio(a, b, c)));
        System.out.println("QUADRADO: " + df.format(areaQuadrado(b)));
        System.out.println("RETANGULO: " + df.format(areaRetangulo(a, b)));
    }

    static double areaRetangulo(double a, double b) {
        return a * b;
    }

    static double areaQuadrado(double b) {
        return b * b;
    }

    static double areaTrapezio(double a, double b, double c) {
        //A = (a+b)*c / 2
        return ((a + b) * c) / 2;
    }

    static double areaCirculo(double c) {
        final double PI = 3.14159;
        return PI * Math.pow(c, 2);
    }

    static double areaTriangulo(double a, double c) {
        //Area = base * altura / 2;
        return (a * c) / 2;
    }
}
