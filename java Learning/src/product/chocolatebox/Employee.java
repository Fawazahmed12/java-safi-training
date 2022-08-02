package product.chocolatebox;

public abstract class Employee {
    String name;
    int noOfChoco;
    private  ChocolateBox chocolateBox;
    Employee(String name, int numCh){
        this.name = name;
        this.noOfChoco = numCh;
    }
    public void setChocolateBox(ChocolateBox chocolateBox) {
        this.chocolateBox = chocolateBox;
    }
    public void openChocolateBox(int numCh) {
        if (chocolateBox.noOfChoco <= 1) {
            System.out.println("Not able to open the chocolate box");
        } else {
            System.out.println(this.name + " is opening " +  this.chocolateBox.name);
        }
    }
    public void takeChocolate(int numCh) {
        if (chocolateBox.noOfChoco <= 1) {
            System.out.println("No adequate amount of chocolate available");
        } else {
            chocolateBox.noOfChoco = chocolateBox.noOfChoco - numCh;
            System.out.println(this.name + " is taking " + numCh);
        }
    }

    public abstract void openChocolateBox();
}
