package methods;

public class Calculadora {

    public static void sum(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("A soma de " + num1 + " mais " + num2 + " é " + result);
    }

    public static void subtraction(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("A subtração de " + num1 + " menos " + num2 + " é " + result);
    }

    public static void multiplication(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " por " + num2 + " é " + result);
    }

    public static void division(double num1, double num2) {
        double result = num1 / num2;
        System.out.println("A divisão de " + num1 + " por " + num2 + " é " + result);
    }
}

