package br.com.dio.exercicios.loops;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int i = 0;
        int maior = 0;
        int media = 0;

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            media += numero;
            if(numero > maior) maior = numero;
            i++;
        }while(i < 5);

        media /= 5;
        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + media);
    }
}
