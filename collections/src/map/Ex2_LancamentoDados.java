package map;

import java.util.*;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido.
 */
public class Ex2_LancamentoDados {
    public static void main(String[] args) {
        Random randomDado = new Random();
        List<Integer> numerosDado = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int dado = randomDado.nextInt(1, 7);
            numerosDado.add(dado);
        }


        Map<Integer, Integer> qtdDeCadaValor = new HashMap<>();
        for(Integer numero : numerosDado){
            if(qtdDeCadaValor.containsKey(numero)){
                qtdDeCadaValor.put(numero, qtdDeCadaValor.get(numero) + 1);
            }else{
                qtdDeCadaValor.put(numero, 1);
            }
        }

        System.out.println("Quantas vezes o dado caiu em cada número: ");
        for (Map.Entry<Integer, Integer> numero: qtdDeCadaValor.entrySet()) {
            System.out.println("Número " + numero.getKey() + " - " + numero.getValue() + " vezes.");
        }
    }
}
