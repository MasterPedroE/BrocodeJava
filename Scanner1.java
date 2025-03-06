import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args){
        // Chamado do scanner + variável
        java.util.Scanner abobalhado = new java.util.Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = abobalhado.nextLine();

        // Tipo de input
        System.out.print("Digite a sua idade: ");
        int idade = abobalhado.nextInt();

        // Consumir a quebra de linha restante após nextInt()
        abobalhado.nextLine();

        System.out.print("Digite o seu gpa: ");
        String gpaInput = abobalhado.nextLine();
        double gpa = Double.parseDouble(gpaInput); // Converte a string para double

        System.out.print("Você é um estudante? (true/false)");
        boolean estudante = abobalhado.nextBoolean();



        System.out.println("Olá, " + name);
        System.out.println("Sua idade é de " + idade + " anos");
        System.out.println("Seu gpa é de: " + gpa);
        System.out.println("Seu status é de: " + estudante);

        if(estudante){
            System.out.print("Você é estudante! ");
        }
        else{
            System.out.print("Você não é estudante! ");
        }
        abobalhado.close();
    }
}