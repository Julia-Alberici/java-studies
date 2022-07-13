package br.com.dio.exercicios.arrays;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
armazene-os num vetor.
Ao final, mostre os números e seus sucessores.
*/

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] twentyRandoms = new int[20];

        for(int i = 0; i < twentyRandoms.length; i++){
            int number = random.nextInt(100);
            twentyRandoms[i] = number;
        }
        System.out.print("Números aleatórios: ");
        for(int number : twentyRandoms){
            System.out.print(number + " ");
        }
        System.out.print("\nSucessores dos números aleatórios: ");
        for(int number : twentyRandoms){
            System.out.print(++number + " ");
        }
    }
}
