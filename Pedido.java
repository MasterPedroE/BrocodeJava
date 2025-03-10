import java.util.Scanner;

public class Pedido {
    public static void main(String[] args){

        String pedido = "";
        double preco = 0;
        int quantidade = 0;
        double precofinal = 0;


        Scanner pedidos = new Scanner(System.in);

        System.out.print("O que deseja?: ");
        pedido = pedidos.nextLine();

        System.out.print("Qual é o preço que ira pagar por unidade?: ");
        preco = pedidos.nextDouble();

        System.out.print("Quantos deseja?: ");
        quantidade = pedidos.nextInt();

        precofinal = preco * quantidade;

        System.out.println("Você pediu " + quantidade + " " + pedido + ", Custando, no total: " + precofinal);


        pedidos.close();

    }
}