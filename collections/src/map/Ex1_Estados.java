package map;

import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class Ex1_Estados {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> estados = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);

        }};
        System.out.println(estados);

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        estados.put("RN", 3534165);
        System.out.println(estados);

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");
        System.out.println(estados.containsKey("PB"));
        estados.put("PB", 4039277);
        System.out.println(estados);

        System.out.println("Exiba a população do estado PE: " + estados.get("PB"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> estados1 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        for(Map.Entry<String, Integer> estado : estados1.entrySet())
            System.out.println(estado.getKey() + " - " + estado.getValue());

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> estados2 = new TreeMap<>(estados);
        for(Map.Entry<String, Integer> estado : estados2.entrySet())
            System.out.println(estado.getKey() + " - " + estado.getValue());

         System.out.println("Exiba o estado com o menor população e seu respectivo valor: ");
         Integer menorPopulacao = Collections.min(estados.values());
         String estadoMenorPopulacao = "";
         for(Map.Entry<String, Integer> estado : estados.entrySet()){
             if(estado.getValue() == menorPopulacao){
                 estadoMenorPopulacao = estado.getKey();
                 System.out.println("Estado com menor população: " + estadoMenorPopulacao + " - " + menorPopulacao);
             }
         }

         System.out.println("Exiba o estado com a maior população (%s) e seu respectivo valor: ");
         Integer maiorPopulacao = Collections.max(estados.values());
         String estadoMaiorPopulacao = "";
         for(Map.Entry<String, Integer> estado : estados.entrySet()){
             if(estado.getValue() == maiorPopulacao){
                 estadoMaiorPopulacao = estado.getKey();
                 System.out.println("Estado com maior população: " + estadoMaiorPopulacao + " - " + maiorPopulacao);
             }
         }

         int soma = 0;
         for(Map.Entry<String, Integer> estado : estados.entrySet()){
             soma += estado.getValue();
         }
         System.out.println("Exiba a soma da população desses estados: " + soma);

         System.out.println("Exiba a média da população deste dicionário de estados: " + (soma / estados.size()));

         System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas");
         estados.clear();

         System.out.println("Confira se a lista está vazia: " + estados.isEmpty());
    }
}
