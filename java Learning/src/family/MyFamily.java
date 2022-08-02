package family;

public class MyFamily {
    public static void main(String args[]){
        Human.myInfo();
        Human.myFatherInfo();
        Human.myMothererInfo();
        Human.myBrotherInfo();
    }
}

class Human {
    static String name;
    static int age;
    static String occupation;
    static String gender;

    public static void myInfo(){
        name = "Fawaz";
        age = 22;
        occupation = "softwareEngineer";
        gender = "male";
        System.out.println("Name="+name+", "+"Age=" +age+", "+"Occupation=" +occupation+", "+"Gender=" +gender);
    }

    public static void myFatherInfo(){
        name = "Nooh";
        age = 52;
        occupation = "Teacher";
        gender = "male";
        System.out.println("FatherName="+name+", "+"FatherAge=" +age+", "+"Occupation=" +occupation+", "+"Gender=" +gender);
    }

    public static void myMothererInfo(){
        name = "Rahmath";
        age = 41;
        occupation = "HouseWife";
        gender = "female";
        System.out.println("MotherName="+name+", "+"MotherAge=" +age+", "+"Occupation=" +occupation+", "+"Gender=" +gender);
    }

    public static void myBrotherInfo(){
        name = "Irfan";
        age = 20;
        occupation = "studying";
        gender = "male";
        System.out.println("BrotherName="+name+", "+"BrotherAge=" +age+", "+"Occupation=" +occupation+", "+"Gender=" +gender);
    }

}
