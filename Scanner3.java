import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args){
        double largura = 0;
        double altura = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a largura: ");
        largura = scanner.nextDouble();

        System.out.print("Digite a altura: ");
        altura = scanner.nextDouble();

        area = largura * altura;

        System.out.println("A área é de: " + area + "cm²");

        scanner.close();

    }
}