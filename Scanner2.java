import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args){

        Scanner carlinhos = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = carlinhos.nextInt();

        carlinhos.nextLine();

        System.out.print("Digite sua cor favorita: ");
        String cor = carlinhos.nextLine();

        System.out.println("Você tem " + idade + " anos");
        System.out.print("Ssua cor favorita é " + cor);

        carlinhos.close();
    }

}
