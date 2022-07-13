package br.com.dio.exercicios.loops;
/*
Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int par = 0;
        int impar = 0;
        int i = 0;

        System.out.println("Quantos números deseja passar?");
        int qtd = scan.nextInt();

        do{
            System.out.println("Digite um número inteiro: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) ++par;
            else ++impar;

            i++;
        }while(i < qtd);

        System.out.println("Número de pares: " + par);
        System.out.println("Número de impares: " + impar);
    }
}
