package family.familyusingscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Human {
    String name;
    int age;

    List<Human> familyMembers = new ArrayList<>();

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {

    }

    public void addMember(Scanner myObj) {

        System.out.println("Enter the name");
        name = myObj.next();
        System.out.println("Enter the age");
        age = myObj.nextInt();
        familyMembers.add(new Human(name, age));
    }


    public void greetAll() {
        familyMembers.forEach(person -> System.out.println("Name : " + person.name + ", Age : " + person.age));
    }
}
