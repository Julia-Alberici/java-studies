package br.com.dio.exercicios.loops;

/*
Faça um programa que calcule o fatorial
de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/

import java.util.Scanner;

public class Ex6_Fatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número: ");
        int numero = scan.nextInt();
        int fatorial = 1;

        for(int i = numero; i >= 1; i--){
            fatorial *= i;
        }

        System.out.println("Fatorial: " + fatorial);
    }
}
