package methods;

public class Mensagem {

    public static void getMessage(int hour) {
        String message;

       if(hour > 4 && hour < 12){
           message = "Bom dia!";
       }else if(hour > 11 && hour < 19){
           message = "Boa tarde!";
       }else{
           message = "Boa noite!";
       }
        System.out.println(message);

    }
}

