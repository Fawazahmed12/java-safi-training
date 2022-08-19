package family.familyusingarraylist;

import family.familymembers.Family;

import java.util.ArrayList;

public class MyFamily {
    public static void main(String args[]){
        ArrayList<FamilyList> familyMembers = new ArrayList<FamilyList>();
//        ArrayList<Integer> familyMemberss = new ArrayList<Integer>();
//        ArrayList< String> familyMembers = new ArrayList< String>();

        FamilyList person1 = new FamilyList(1, "Fawaz", "engineer", 22);
        FamilyList person2 = new FamilyList(2, "Nooh", "Teacher", 52);
        FamilyList person3 = new FamilyList(3, "Rahmath", "Housewife", 41);
        FamilyList person4 = new FamilyList(4, "Irfan", "student", 20);

        familyMembers.add(person1);
        familyMembers.add(person2);
        familyMembers.add(person3);
        familyMembers.add(person4);
//        familyMembers.add("78");
//        familyMemberss.add(5);

        for(FamilyList fam:familyMembers){
            fam.display();
            System.out.println();
        }

    }
}


class FamilyList {
    int id;
    String name;
    String occupation;
    int age;

    //constructor
    FamilyList(int id, String name, String occupation, int age) {
        this.id = id;
        this.name = name;
        this.occupation = occupation;
        this.age = age;
    }

    public void display(){
//        String name = "rasikhan";
//        int age = 22;
//        var age3 = 44;
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Occupation:"+occupation);
        System.out.println("Age:"+age);
    }

}
