package book.ocp.chapter2.page55;

public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait checkTrait) {
        if (checkTrait.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        print(new Animal("fish", false, true), a -> a.isCanHop());
        print(new Animal("kangaroo", true, false), a -> a.isCanHop());
    }
}
