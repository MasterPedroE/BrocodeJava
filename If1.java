import java.util.Scanner;

public class If1 {
    public static void main(String[] args){

        int age = 0;
        String name;
        boolean eestudante;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        name = scanner.nextLine();
        System.out.print("Quantos anos você tem?: ");
        age = scanner.nextInt();

        //Grupo 1
        if(name.isEmpty()){
            System.out.println("Digite seu nome!");
        }else{
            System.out.println("Olá, " + name);
        }

        System.out.print("Você é um estudante? (true/false): ");
        eestudante = scanner.nextBoolean();




        //Grupo 2
        if (age >= 65) {
            System.out.println("Você está velho!");
        }
        else if(age >= 18){
            System.out.println("Você é um adulto! ");
        }
        else if (age < 0) {
            System.out.println("Você está dentro de um tijolo! que pena");
        }
        else if (age == 0) {
            System.out.println("Você é um Baobao!");
        }
        else{
            System.out.println("Você é menor de idade!");
        }

        //Grupo 3
        if(eestudante){
            System.out.println("Você é um estudante!");
        }else {
            System.out.println("Você não é um estudante!");
        }

        scanner.close();
    }
}
