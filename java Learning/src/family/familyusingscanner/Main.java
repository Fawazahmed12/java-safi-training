package family.familyusingscanner;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenuDetails();
    }

    public static void mainMenuDetails() {
        Human member = new Human();
        Scanner myObj = new Scanner(System.in);
        System.out.println(" A). Add a member");
        System.out.println(" G). Greet all");
        System.out.println(" E). Exit");
        while (true) {
            System.out.println("Type an option (A,G,E) : ");
            String letter = myObj.next();
            if (letter.equalsIgnoreCase("A")) {
                member.addMember(myObj);
            }
//            we use to compare like that also:
//            if (Objects.equals(letter, "A")) {
//                member.addMember(myObj);
//            }
            if (letter.equalsIgnoreCase("G")) {
                member.greetAll();
            }
            if (letter.equalsIgnoreCase("E")) {
                System.out.println("Exit the program");
                break;
            }
        }
    }
}
