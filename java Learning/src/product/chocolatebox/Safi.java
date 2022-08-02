package product.chocolatebox;

public class Safi extends  Employee {

    Safi() {
        super("Safi", 4);
    }
    @Override
    public void openChocolateBox(){
        super.openChocolateBox(4);
        System.out.println(this.name + " is taking Water Bottle to drink water");
    }
}
