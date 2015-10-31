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
public class _1828_Bazinga {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int t = teclado.nextInt();
        String result;
        
        for(int i = 1; i <= t; i++){
            String sheldon = teclado.next();
            String raj = teclado.next();
            //1.
            if(sheldon.contains("tesoura") && raj.contains("papel")){
                System.out.printf("Caso #%d: Bazinga!\n", i);
            }else if(sheldon.contains("papel") && raj.contains("tesoura")){
                System.out.printf("Caso #%d: Raj trapaceou!\n", i);
            }
            //2.
            else if(sheldon.contains("papel") && raj.contains("pedra")){
                System.out.printf("Caso #%d: Bazinga!\n", i);
            }else if(sheldon.contains("pedra") && raj.contains("papel")){
                System.out.printf("Caso #%d: Raj trapaceou!\n", i);
            }
            //3.
            else if(sheldon.contains("pedra") && raj.contains("lagarto")){
                System.out.printf("Caso #%d: Bazinga!\n", i);
            }else if(sheldon.contains("lagarto") && raj.contains("pedra")){
                System.out.printf("Caso #%d: Raj trapaceou!\n", i);
            }
            //4.
            else if(sheldon.contains("lagarto") && raj.contains("Spock")){
                System.out.printf("Caso #%d: Bazinga!\n", i);
            }else if(sheldon.contains("Spock") && raj.contains("lagarto")){
                System.out.printf("Caso #%d: Raj trapaceou!\n", i);
            }
            //5.
            else if(sheldon.contains("Spock") && raj.contains("tesoura")){
                System.out.printf("Caso #%d: Bazinga!\n", i);
            }else if(sheldon.contains("tesoura") && raj.contains("Spock")){
                System.out.printf("Caso #%d: Raj trapaceou!\n", i);
            }
            //6.
            else if(sheldon.contains("tesoura") && raj.contains("lagarto")){
                System.out.printf("Caso #%d: Bazinga!\n", i);
            }else if(sheldon.contains("lagarto") && raj.contains("tesoura")){
                System.out.printf("Caso #%d: Raj trapaceou!\n", i);
            }
            //7.
            else if(sheldon.contains("lagarto") && raj.contains("papel")){
                System.out.printf("Caso #%d: Bazinga!\n", i);
            }else if(sheldon.contains("papel") && raj.contains("lagarto")){
                System.out.printf("Caso #%d: Raj trapaceou!\n", i);
            }
            //8.
            else if(sheldon.contains("papel") && raj.contains("Spock")){
                System.out.printf("Caso #%d: Bazinga!\n", i);
            }else if(sheldon.contains("Spock") && raj.contains("papel")){
                System.out.printf("Caso #%d: Raj trapaceou!\n", i);
            }
            //9.
            else if(sheldon.contains("Spock") && raj.contains("pedra")){
                System.out.printf("Caso #%d: Bazinga!\n", i);
            }else if(sheldon.contains("pedra") && raj.contains("Spock")){
                System.out.printf("Caso #%d: Raj trapaceou!\n", i);
            }
            
            //10.
            else if(sheldon.contains("pedra") && raj.contains("tesoura")){
                System.out.printf("Caso #%d: Bazinga!\n", i);
            }else if(sheldon.contains("tesoura") && raj.contains("pedra")){
                System.out.printf("Caso #%d: Raj trapaceou!\n", i);
            }
            else if(sheldon.contains(raj)){
                System.out.printf("Caso #%d: De novo!\n", i);
            }
        }
    }
}
