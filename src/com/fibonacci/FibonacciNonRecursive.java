package com.fibonacci;

import java.util.Scanner;

public class FibonacciNonRecursive {
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
        int curr = 0;
        int ant = 0;

        for(int i =1; i <= num; i++){
            if(i == 0){
                curr = 0;
                ant = 0;
            } else if (i == 1) {
                curr = 1;
                ant = 0;
            }else{
                curr = curr + ant;
                ant = curr - ant;
            }

        }
        return curr;
    }
}
