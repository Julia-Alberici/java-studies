package set;

/* Crie uma classe LinguagemFavorita que possua os atributos
nome, anoDeCriacao e ide.
Em seguida, crie um conjunto com 3 linguagens
e faça um programa que ordene esse conjunto por:
*/

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex2_Linguagem {
    public static void main(String[] args) {

        System.out.println("Ordem de inserção: ");
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("javascript", 1995, "VScode"));
            add(new LinguagemFavorita("java", 1991, "Intellij"));
            add(new LinguagemFavorita("python", 1990, "PyCharm"));
        }};
        System.out.println(linguagens);

        System.out.println("Ordem natural(nome): ");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        System.out.println(linguagens2);

        System.out.println("Ordem IDE: ");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorIDE());
        linguagens3.addAll(linguagens);
        System.out.println(linguagens3);

        System.out.println("Ordem anoDeCriacao e nome: ");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorAnoNome());
        linguagens4.addAll(linguagens);
        System.out.println(linguagens4);

        System.out.println("Ordem nome, anoDeCriacao e IDE: ");
        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorNomeAnoIDE());
        linguagens5.addAll(linguagens);
        System.out.println(linguagens5);
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }
    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
       return this.getNome().compareTo(linguagemFavorita.getNome());
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(ano != 0) return ano;

        return l1.getNome().compareTo(l2.getNome());
    }
}
class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome != 0) return nome;

        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());

        return l1.getIde().compareTo(l2.getIde());
    }
}
