package methods;

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void getFinalValue(int parcelas, double valor) {
        double valorFinal;
        if (parcelas == 2) {
            valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("O valor final para parcelamento em 2x é " + valorFinal);
        } else if (parcelas == 3) {
            valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("O valor final para parcelamento em 3x é " + valorFinal);
        } else {
            System.out.println("Número de parcelas não aceito");
        }
    }
}

