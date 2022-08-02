package product.chocolatebox;

public class Sheerin extends Employee {
    Sheerin() {
        super("Sheerin", 2);
    }

    @Override
    public void openChocolateBox() {
        super.openChocolateBox(2);
    }
}
