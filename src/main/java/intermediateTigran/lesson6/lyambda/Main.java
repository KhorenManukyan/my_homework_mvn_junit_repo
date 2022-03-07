package intermediateTigran.lesson6.lyambda;

public class Main {
    public static void main(String[] args) {
        long l1 = System.nanoTime();
        User user = new User() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };
        long l2 = System.nanoTime();

        long l3 = System.nanoTime();
        User user1 = () -> System.out.println("hello");
        long l4 = System.nanoTime();
        System.out.println(l2 - l1);
        System.out.println(l4 - l3);

        System.out.println(user);
        System.out.println(user1);

    }
}

interface User{
    void print();
}
