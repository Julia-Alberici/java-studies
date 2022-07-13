package list;
/*
 Ultilizando listas,
 faça um programa que faça 5 perguntas para uma pessoas sobre um crime.
 As perguntas são:
 1 - Telefonou para a vítima?
 2 - Esteve no local do crime?
 3 - Mora perto da vítima?
 4 - Devia para a vítima?
 5 - Já trabalhou com a vítima?

 Se a pessoa responder positivamente a 2 questões ela deve ser
 classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
 e 5 como Assassina. Caso contrário, ela será classificada como "Inocente".
*/

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex2_Crime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();
        List<String> respostasPositivas = new ArrayList<>();

        System.out.println("Responda com sim ou não: ");
        System.out.println("Telefonou para a vítima?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("Esteve no local do crime?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("Mora perto da vítima?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("Devia para a vítima?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(scan.next().toLowerCase());

        for(String resposta : respostas){
            if(resposta.contains("s")){
                respostasPositivas.add(resposta);
            }
        }

        int sizeYes = respostasPositivas.size();

        if(sizeYes == 2){
            System.out.println("Você foi classificado: Suspeito!");
        }else if(sizeYes == 3 || sizeYes == 4){
            System.out.println("Você foi classificado: Cúmplice!");
        }else if(sizeYes == 5){
            System.out.println("Você foi classificado: Assassino!");
        }else{
            System.out.println("Você foi classificado: Inocente!");
        }
    }
}
