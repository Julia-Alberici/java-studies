package set;

/*
Dadas as seguintes informações sobre séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/


import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {


        System.out.println("Ordem aleatória: ");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
            + serie.getTempoEpisodio());
        }

        System.out.println("Ordem de inserção: ");
        Set<Serie> minhasSeries1 = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for(Serie serie : minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        System.out.println("Ordem natural: ");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        for(Serie serie : minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        System.out.println("Ordem Nome/Gênero/TempoEpisodio: ");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie : minhasSeries3){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        System.out.println("Ordem gênero: ");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for(Serie serie: minhasSeries4){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        System.out.println("Ordem Tempo episódio: ");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempo());
        minhasSeries5.addAll(minhasSeries);
        for(Serie serie : minhasSeries5){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }
    }
}

class ComparatorNomeGeneroTempo implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

    }
}

class ComparatorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getGenero().compareTo(s2.getGenero());
    }
}

class ComparatorTempo implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}



