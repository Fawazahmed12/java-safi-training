package family.myfamily;

public class Siblings {
    String name;
    int age;
    String job;
    String gender;

    private Siblings(String name, int age, String job, String gender) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
    }
    static Siblings setSiblingDetails(String name, int age, String job, String gender ) {
        Siblings sibling  = new Siblings(name, age, job, gender);
        Siblings sib = sibling.getSiblingDetails(name, age, job, gender);
        return sib;
    }
    private Siblings getSiblingDetails(String name, int age, String job, String gender) {
        return new Siblings(name,age,job, gender);
    }
}
