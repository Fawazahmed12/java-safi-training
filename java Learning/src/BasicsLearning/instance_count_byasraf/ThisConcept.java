package BasicsLearning.instance_count_byasraf;

public class ThisConcept {
    String name;
    int age;
    String degree;

    public ThisConcept(){

    }

    void printMyAddressHandle(){
        System.out.println(this); // address will be print
    System.out.println(this.age); // age value will be print
    System.out.println(age); // age value will be print
    }

    public static void main(String args[]) {

        ThisConcept thisConcept1 = new ThisConcept();
        thisConcept1.age = 10;
        thisConcept1.name = "fawaz";
        thisConcept1.degree = "MCA";
        thisConcept1.printMyAddressHandle(); // address will be print


        ThisConcept thisConcept2 = new ThisConcept();
        thisConcept2.age = 20;
        thisConcept2.name = "rasik";
        thisConcept2.degree = "BBA";
        thisConcept2.printMyAddressHandle(); //  address will be print
    }
}
