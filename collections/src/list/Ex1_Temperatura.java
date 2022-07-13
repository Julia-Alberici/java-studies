package list;

/*
Faça um programa que receba a temperatura média dos 6 primeiros meses
do anos e armazene-os em uma lista.
Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta médias,
e em que mês elas ocorreram(mostrar o mês por extenso:1- Janeiro,
2-Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex1_Temperatura {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> temperaturas = new ArrayList<>();
        List<Integer> acimaDaMedia = new ArrayList<>();
        List<String> mesAcimaDaMedia = new ArrayList<>();


        System.out.println("Insira a temperatura média de Janeiro:");
        temperaturas.add(scan.nextInt());
        System.out.println("Insira a temperatura média de Fevereiro:");
        temperaturas.add(scan.nextInt());
        System.out.println("Insira a temperatura média de Março:");
        temperaturas.add(scan.nextInt());
        System.out.println("Insira a temperatura média de Abril:");
        temperaturas.add(scan.nextInt());
        System.out.println("Insira a temperatura média de Maio:");
        temperaturas.add(scan.nextInt());
        System.out.println("Insira a temperatura média de Junho:");
        temperaturas.add(scan.nextInt());


        System.out.println("Temperaturas: " + temperaturas);

        int somaTemp = 0;
        for (int temp : temperaturas) {
            somaTemp += temp;
        }
        int mediaTemp = somaTemp / temperaturas.size();
        System.out.println("Média semestral das temperaturas: " + mediaTemp);

        int i = 0;
        for(int temp : temperaturas){
            if(temp > mediaTemp) {
                acimaDaMedia.add(temp);
                if(i == 0) mesAcimaDaMedia.add("Janeiro");
                if(i == 1) mesAcimaDaMedia.add("Fevereiro");
                if(i == 2) mesAcimaDaMedia.add("Março");
                if(i == 3) mesAcimaDaMedia.add("Abril");
                if(i == 4) mesAcimaDaMedia.add("Maio");
                if(i == 5) mesAcimaDaMedia.add("Junho");
            }
            i++;

        }
        System.out.println("Temperaturas acima da média semestral: " + acimaDaMedia);
        System.out.println("Meses em que a temperatura esteve acima da média semestral: " + mesAcimaDaMedia);

    }
}
