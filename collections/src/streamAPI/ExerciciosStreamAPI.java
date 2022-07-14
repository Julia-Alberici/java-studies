package streamAPI;


import java.util.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        numerosAleatorios.forEach(System.out::println);
        System.out.println(numerosAleatorios);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());

//        collectSet.forEach(System.out::println);
        System.out.println(collectSet);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        List<Integer> collectListInt = new ArrayList<>(numerosAleatorios.stream()
                .map(Integer::parseInt).toList());


        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());

        System.out.println(listParesMaioresQue2);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares: ");
        collectListInt.removeIf(integer -> (integer % 2 != 0));
        System.out.println(collectListInt);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        List<String> skip3Elements = numerosAleatorios.stream().skip(3).toList();
        System.out.println(skip3Elements);

        List<Integer> numerosAleatoriosInt = new ArrayList<>(numerosAleatorios.stream().map(Integer::parseInt).toList());
        long countNumerosUnicos = numerosAleatoriosInt.stream().distinct().count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatoriosInt.stream().mapToInt(intValue -> intValue).min().ifPresent(System.out::println);
        /*.mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer intValue) {
                return intValue;
            }
        }).min().ifPresent(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }});*/

        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInt.stream().mapToInt(intValue -> intValue).max().ifPresent(System.out::println);

        Integer somaDosNumerosImpares =
                numerosAleatoriosInt.stream().filter(i -> i % 2 != 0).reduce(0, Integer::sum);
        System.out.println("Pegue apenas os números ímpares e some: " + somaDosNumerosImpares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> naturalOrder = numerosAleatoriosInt.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println(naturalOrder);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        List<Integer> imparMultiplo3e5 = new ArrayList<>(numerosAleatoriosInt.stream().filter(i -> i % 2 != 0 && i % 3 == 0 || i % 5 == 0).toList());
        System.out.println(imparMultiplo3e5);

    }
}
