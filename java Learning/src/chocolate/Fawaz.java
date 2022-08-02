package chocolate;

public class Fawaz {
    String name = "fawaz";
    private  ChocolateBox chocolateBox;

     Fawaz() {

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
