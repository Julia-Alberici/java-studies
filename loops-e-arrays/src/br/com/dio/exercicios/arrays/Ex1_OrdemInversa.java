package br.com.dio.exercicios.arrays;

/*
Faça um Programa que leia um vetor de 5 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {2, 3, 4, 5, 6};

        System.out.print("Vetor: ");

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }

}
