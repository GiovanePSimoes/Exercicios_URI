/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_3;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Giovane
 */
public class _1120_RevisãoDeContrato {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int d = -1;
        long valor = -1;

        while (true) {
            d = teclado.nextInt();
            valor = teclado.nextLong();
            BigDecimal n = new BigDecimal(valor);
            if (d == 0 && valor == 0) {
                break;
            } else {
                long numero = contrato(d, n);
                System.out.println(numero);
            }
        }
    }

    static long contrato(int d, BigDecimal n) {
        long numero = 0;
        char c = Character.forDigit(d, 10);
        String cadeiaNumerica = String.valueOf(n);
        String cadeiaNumericaNova = "";

        for (int i = 0; i < cadeiaNumerica.length(); i++) {
            if (cadeiaNumerica.charAt(i) != (c)) {
                cadeiaNumericaNova += cadeiaNumerica.charAt(i);
            }
        }

        return numero = Long.parseLong(cadeiaNumericaNova);
    }
}
