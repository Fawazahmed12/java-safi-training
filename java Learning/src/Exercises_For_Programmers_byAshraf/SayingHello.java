package Exercises_For_Programmers_byAshraf;

import java.util.Scanner;

public class SayingHello {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        boolean quit = false;
//        while(!quit) {
//            System.out.println("What is your name?");
//            String name = scanner.nextLine().toLowerCase();
//            if (name.equals("james")) {
//                System.out.println("Stop testing your own code you loser\n");
//            } else if (name.equals("steve")) {
//                System.out.println("You see this works?\n");
//            }
//            else if(name.equals("quit")) {
//                System.out.println("Cya!");
//                quit = true;
//            }
//            else {
//                System.out.println("Hello " + name.substring(0,1).toUpperCase() + name.substring(1, name.length()).toLowerCase() + ", nice to meet you!\n");
//            }

        while(true) {
            System.out.println("What is your name?");
            String name = scanner.nextLine().toLowerCase();
            if (name.equals("james")) {
                System.out.println("Stop testing your own code you loser\n");
            } else if (name.equals("steve")) {
                System.out.println("You see this works?\n");
            }
            else if(name.equals("quit")) {
                System.out.println("Cya!");
                break;
            }
            else {
                System.out.println("Hello " + name.substring(0,1).toUpperCase() + name.substring(1, name.length()).toLowerCase() + ", nice to meet you!\n");
            }
        }
    }
}
