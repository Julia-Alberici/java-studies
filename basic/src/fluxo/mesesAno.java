package fluxo;

public class mesesAno {

    public static String getMes(int mes) {
        String nomeMes;
        boolean ferias = false;
        if (mes == 1) {
            nomeMes = "Janeiro";
            ferias = true;
        } else if (mes == 2) {
            nomeMes = "Fevereiro";
        } else if (mes == 3) {
            nomeMes = "Março";
        } else if (mes == 4) {
            nomeMes = "Abril";
        } else if (mes == 5) {
            nomeMes = "Maio";
        } else if (mes == 6) {
            nomeMes = "Junho";
        } else if (mes == 7) {
            nomeMes = "Julho";
            ferias = true;
        } else if (mes == 8) {
            nomeMes = "Agosto";
        } else if (mes == 9) {
            nomeMes = "Setembro";
        } else if (mes == 10) {
            nomeMes = "outubro";
        } else if (mes == 11) {
            nomeMes = "Novembro";
        } else if (mes == 12) {
            nomeMes = "Dezembro";
            ferias = true;
        } else {
            return "Por favor passe um número que corresponda a um mês";
        }

        if (ferias) {
            return "O mês é: " + nomeMes + " e estamos em periodo de férias!";
        } else {
            return "O mês é: " + nomeMes;
        }
    }
}
