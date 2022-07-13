package set;

import java.util.*;

public class Ex1_ArcoIris {

    public static void main(String[] args) {
        System.out.println("Crie um conjunto contendo as cores do arco-íris");
        Set<String> coresArcoIris = new HashSet<>(
                Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "azul-escuro", "violeta")
        );
        System.out.println(coresArcoIris);

        System.out.println("Exiba todas as cores uma abaixo da outra");
        for(String corArcoIris : coresArcoIris ){
            System.out.println(corArcoIris);
        }
        System.out.println("Quantidade de cores que o arco-íris tem: " + coresArcoIris.size());

        System.out.println("Ordem alfabética:");
        Set<String> coresArcoIris2 = new TreeSet<>(
                Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "azul-escuro", "violeta")
        );
        System.out.println(coresArcoIris2);

        System.out.println("Ordem inversa:");
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris2);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Cores que começam com v");
        for(String cor : coresArcoIris){
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova as cores que não começam com v");
        coresArcoIris.removeIf(cor -> !cor.startsWith("v"));
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto");
        coresArcoIris.clear();
        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());

    }
}


