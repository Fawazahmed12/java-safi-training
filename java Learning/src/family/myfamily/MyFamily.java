package family.myfamily;

import java.util.ArrayList;

public class MyFamily {
    String myName;
    int myAge;
    String job;
    ArrayList<Parents> parents = new ArrayList<Parents>();
    ArrayList<Siblings> siblings = new ArrayList<Siblings>();

    MyFamily(String name, int age, String job){
        this.myName = name;
        this.myAge = age;
        this.job = job;
    }
   public void getParentCount() {
        long count = this.parents.stream().count();

        if (count == 1) {
            System.out.println("Single Parent");
        } else {
            System.out.println("Have both parents");
        }
    }
    public void getSiblingCount() {
        long count = this.siblings.size();

        if (count == 1) {
            System.out.println("Have " + count + " sibling");
        } else {
            System.out.println("Have " + count + " siblings");
        }
    }
    public void getGender() {
        siblings.forEach((sibling) -> {
            if (sibling.gender == "M") {
                System.out.println(sibling.name + " is Male");
            }
            if (sibling.gender == "F") {
                System.out.println(sibling.name + " is Female");
            }
        });
    }
    public void getElderOrYoungerSibling() {

        siblings.forEach((sibling) -> {
            if (sibling.age > myAge) {
                System.out.println(sibling.name + " is Elder than "+ myName);
            }
            if (sibling.age < myAge) {
                System.out.println(sibling.name + " is Younger to "+ myName);
            }
        });
    }
}
