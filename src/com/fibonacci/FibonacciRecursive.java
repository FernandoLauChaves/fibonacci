package com.fibonacci;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para saber seu Fibonacci: ");
        int num = sc.nextInt();
        while(num < 0){
            System.out.print("Número inválido, digite novamente: ");
            num = sc.nextInt();
        }

        System.out.print("O Resultado é: " + fibonacci(num));

    }

    public static long fibonacci(int num){

        if(num == 0){
            return 0;
        }else if(num < 2){
            return 1;
        }else{
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
