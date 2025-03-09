import java.util.Scanner;

public class Libs_game {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String adjetive1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective: ");
        adjetive1 = scanner.nextLine();
        System.out.println("Enter a noun: (animal or person)");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb end with -ing: ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        adjective3 = scanner.nextLine();


        System.out.println("\nToday a went to a " + adjetive1 + "Zoo");
        System.out.println("In an exhbit, I saw a" + noun1 + ".");
        System.out.println( noun1 + " was" + adjective2 + " and" + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();

    }

}
