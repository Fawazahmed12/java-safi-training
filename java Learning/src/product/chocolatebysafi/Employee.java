package chocolatebysafi;

public class Employee {

    String name;
    private  ChocolateBox chocolateBox;

    Employee(String name){
        this.name = name;
    }


    public void setChocolateBox(ChocolateBox chocolateBox) {
        this.chocolateBox = chocolateBox;
    }



    public void openChocolateBox() {
        System.out.println(this.name + " is opening " +  this.chocolateBox.name);
    }

    public void takeChocolate(int numCh) {
        System.out.println(this.name + " am taking " + numCh);
    }
}
