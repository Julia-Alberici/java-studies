package one.digitalinovation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args) {
        Set<Carro> setCarros = new HashSet<>();

        setCarros.add(new Carro("Ford"));
        setCarros.add(new Carro("Chevrolet"));
        setCarros.add(new Carro("Fiat"));
        setCarros.add(new Carro("Pegeout"));
        setCarros.add(new Carro("Zip"));
        setCarros.add(new Carro("Alfa Romeo"));

        System.out.println(setCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Pegeout"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(treeSetCarros);

    }
}
