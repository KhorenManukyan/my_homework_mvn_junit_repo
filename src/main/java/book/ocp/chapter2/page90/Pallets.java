package book.ocp.chapter2.page90;

public class Pallets extends Food {
    public Pallets(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Pallets eaten: " + getQuantity());
    }
}
