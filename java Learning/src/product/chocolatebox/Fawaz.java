package product.chocolatebox;

public class Fawaz extends Employee {
    Fawaz() {
        super("Fawaz", 5);
    }

    @Override
    public void openChocolateBox() {
        super.openChocolateBox(5);
    }
}
