package br.com.dio.exercicios.arrays;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz
e a sua posição(linha, coluna).
*/

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];
        int linha = 0 , coluna = 0;
        int menor = 10;
        int posLinha = 0;
        int posColuna = 0;

        for(int x = 0; x < M.length; x++){
            for(int y = 0; y < M[x].length; y++){
                M[x][y] = random.nextInt(9);
                coluna++;
                if(M[x][y] < menor){
                    menor = M[x][y];
                    posLinha = linha;
                    posColuna = coluna;
                }
            }
            linha++;
            coluna = 0;

            }
        System.out.println("Matriz: ");
            for(int [] linhaArray : M){
                for(int elemento : linhaArray){
                    System.out.print(elemento + " ");
                }
                System.out.println();

        }

        System.out.println("Menor número da matriz: " + menor);
        System.out.print("Posição do menor número da matriz: ");
        System.out.println("\nLinha: " + posLinha + " Coluna: " + posColuna);
    }
}
