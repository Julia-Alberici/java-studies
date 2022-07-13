package methods;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercício Calculadora");
        Calculadora.sum(3, 6);
        Calculadora.subtraction(5, 1.3);
        Calculadora.multiplication(7, 8);
        Calculadora.division(5, 2.5);

        System.out.println("Exercício mensagem");
        Mensagem.getMessage(5);
        Mensagem.getMessage(12);
        Mensagem.getMessage(19);

        System.out.println("Exercício empréstimo");
        Emprestimo.getFinalValue(2, 1000);
        Emprestimo.getFinalValue(3, 1000);
        Emprestimo.getFinalValue(5, 1000);
    }

}

