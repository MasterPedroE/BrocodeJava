import java.util.Scanner;

public class Volume {
    public static void main(String[] args){

        Scanner calculo = new Scanner(System.in);

        double circuferencia;
        double area;
        double volume;
        double raio;

        System.out.print("Digite o raio: ");
        raio = calculo.nextDouble();

        circuferencia = 2 * Math.PI * raio;
        area = Math.PI * Math.pow(raio, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.printf("A circunferência é de: %.1fcm\n", circuferencia);
        System.out.printf("A area é de: %.1fcm²\n", area);
        System.out.printf("O volume é de: %.1fcm³\n", volume);

        calculo.close();
    }
}
