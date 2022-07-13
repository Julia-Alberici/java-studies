package br.com.dio.exercicios.loops;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Objects;
import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "Fulano";
        int idade;
        
        while(!nome.equals("0")){
        System.out.println("Nome: ");
        nome = scan.next();
        System.out.println("Idade: ");
        idade = scan.nextInt();
        }


    }




}
