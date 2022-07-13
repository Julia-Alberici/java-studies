package fluxo;

public class diaSemana {

    public static int getNumberDay(String dia) {
        int numberDay;
        switch (dia) {
            case "domingo":
                numberDay =  1;
            break;
            case "segunda":
                numberDay =  2;
            break;
            case "terça":
                numberDay =  3;
            break;
            case "quarta":
                numberDay = 4;
            break;
            case "quinta":
                numberDay = 5;
            break;
            case "sexta":
                numberDay = 6;
            break;
            case "sabado":
                numberDay = 7;
            break;
            default:
                numberDay = -1;
        }
        return numberDay;

    }
}
