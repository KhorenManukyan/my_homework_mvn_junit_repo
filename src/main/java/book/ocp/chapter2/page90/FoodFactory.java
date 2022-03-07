package book.ocp.chapter2.page90;

public class FoodFactory {
    public static Food getFood(String animalName) {
        switch (animalName) {
            case "zebra":
                return new Hay(100);
            case "rabbit":
                return new Hay(5);
            case "goat":
                return new Hay(30);
            case "polar bear":
                return new Hay(10);
        }
        // Good practice to throw an exception if no matching subclass could be found
        throw new UnsupportedOperationException("Unsupported animal: " + animalName);
    }
}
