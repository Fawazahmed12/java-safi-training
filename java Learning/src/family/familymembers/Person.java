package family.familymembers;

public class Person {
    String name;
    int age;
    String occupation;
    String str = "";

    Person(String name, int age){
        this.name = name;
        this.age = age;
        this.occupation = str;
    }


    //method Overloading
    Person (String name, int age, String occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;

    }

   // method overriding
//    @Override
//    public String toString(){
//        return name + " " + age + " " + occupation;
//    }

    public String getFamiliyDetails(){
        return name + " " + age + " " + occupation;
    }

}
