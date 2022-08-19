package Exercises_For_Programmers_byAshraf;

import java.util.Scanner;

public class MadLib {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean correctInput = false;
        System.out.println("Enter a noun:");
        String noun = scanner.nextLine();
        System.out.println("Enter a verb:");
        String verb = scanner.nextLine();
        System.out.println("Enter an adjective:");
        String adjective = scanner.nextLine();
        System.out.println("Enter an adverb:");
        String adverb = scanner.nextLine();
        System.out.println("Where abouts are you?");
        String location = scanner.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " +
                adverb + " at " + location + "? That's hilarious!");

    }
}
