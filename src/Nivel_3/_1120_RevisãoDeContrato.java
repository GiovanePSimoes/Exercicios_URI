/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_3;

import java.util.Scanner;

/**
 *
 * @author Giovane
 */
public class _1120_RevisãoDeContrato {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        String d = "";
        String valor = "";

        while (true) {
            d = teclado.next();
            valor = teclado.next();

            if (d.contentEquals("0") && valor.contentEquals("0")) {
                break;
            } else {
                System.out.println(contrato(d, valor));
            }
        }
    }

    static StringBuilder contrato(String c, String n) {

        StringBuilder cadeiaNumericaNova = new StringBuilder();
        cadeiaNumericaNova.append("");

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != c.charAt(0)) {
                cadeiaNumericaNova.append(n.charAt(i));
            }
        }

        boolean ehZero = true;
        boolean zeroEsquerda = true;
        for (int i = 0; i < cadeiaNumericaNova.length(); i++) {
            if (cadeiaNumericaNova.charAt(i) != '0') {
                for(int j = i-1; j>0;j--){
                    if(cadeiaNumericaNova.charAt(j) != '0'){
                        zeroEsquerda = false;
                        break;
                    }
                }
                ehZero = false;
                if(zeroEsquerda){
                    cadeiaNumericaNova.delete(0, i);
                }
                break;
            }
        }

        if (ehZero) {
            return cadeiaNumericaNova.replace(0, cadeiaNumericaNova.length(), "0");
        } else {
            return cadeiaNumericaNova;
        }
    }
}
