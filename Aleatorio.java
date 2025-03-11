import java.util.Random;

public class Aleatorio {
    public static void main(String[] args){

        Random aleatorio = new Random();
        
        int number;
        double number2;
        boolean cara;

        number = aleatorio.nextInt(1, 101);
        number2 = aleatorio.nextDouble(1, 101);
        cara = aleatorio.nextBoolean();


        System.out.println(number);
        System.out.println(number2);

        if(cara){
            System.out.println("É cara!");
        }else{
            System.out.println("É coroa!");
        }



    }
}
