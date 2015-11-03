/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aquecimento;

import java.util.Scanner;

/**
 *
 * @author Giovane
 */
public class ManipulacaoBits {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int input = teclado.nextInt();

        // cria um valor inteiro com 1 no bit mais a esquerda e 0s em outros locais
        int displayMask = 1 << 31;

        // para cada bit exibe 0 ou 1
        for (int bit = 1; bit <= 32; bit++) {
            System.out.print((input & displayMask) == 0 ? '0' : '1');

            input <<= 1; // desloca o valor uma posição para a esquerda
            if (bit % 8 == 0) {
                System.out.print(' ');// exibe espaço a cada 8 bits
            }
        }
    }
}
