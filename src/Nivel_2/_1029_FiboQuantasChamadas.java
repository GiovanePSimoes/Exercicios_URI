/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Giovane
 */
public class _1029_FiboQuantasChamadas {

    static int counter;
    static int call;
    
    public static void main(String args[]) throws IOException {
        Scanner teclado = new Scanner(System.in);
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int n = Integer.parseInt(in.readLine());
        
        
        for (int i = 0; i < n; i++) {
            counter = 0;
            call = 0;
            int x = Integer.parseInt(in.readLine());
            int fibo = fibo(x);
            System.out.printf("fib(%d) = %d calls = %d\n",x,call-1, fibo);
        }
    }

    public static int fibo(int n) {
        if(n == 0){
		call++;
		return 0;
	}else if(n == 1){
		call++;
		//counter++;
		return 1;
	}else{
		call++;
		return fibo(n - 1) + fibo(n - 2);
	}
    }

}
