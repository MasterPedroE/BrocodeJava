import java.util.Scanner;

public class Himpotenusa {
    public static void main(String[] args){

        Scanner calculo = new Scanner (System.in);

        double a;
        double b;
        double c;

        System.out.print("Digite o valor de a: ");
        a = calculo.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = calculo.nextDouble();


        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.print("A himpotenusa é de: " + c + "Cm");



        calculo.close();

    }
}
