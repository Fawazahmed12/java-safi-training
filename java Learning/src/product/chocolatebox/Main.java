package product.chocolatebox;

public class Main {

    public static void main(String[] args) {
        ChocolateBox chocolateBox = new ChocolateBox();
        Employee safi = new Safi();
        safi.setChocolateBox(chocolateBox);

        try {
            safi.openChocolateBox();
            safi.takeChocolate(4);
        } catch (Exception exception) {
            System.out.println("not able to open the box");
        }

        Employee fawaz = new Fawaz();
        fawaz.setChocolateBox(chocolateBox);

        try {
            fawaz.openChocolateBox();
            fawaz.takeChocolate(5);
        } catch (Exception exception) {
            System.out.println("not able to open the box");
        }
        Employee sheerin = new Sheerin();
        sheerin.setChocolateBox(chocolateBox);

        try {
            sheerin.openChocolateBox();
            sheerin.takeChocolate(2);
        } catch (Exception exception) {
            System.out.println("not able to open the box");
        }
    }
}
