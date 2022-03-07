package youtube.videos.uroki.java.java8.l329;

interface A {
    static int add(int x, int y) {
        return x + y;
    }

    void printMessage(String message);

    default void sayHello() {
        printMessage("a");
    }
}

interface C extends A {
    default void sayHello() {
        System.out.println("c");
    }
}

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.stream();
//        System.out.println(A.add(5,7));

        A a = new B();
        a.sayHello();
    }
}

class B implements A, C {
    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
//
//    @Override
//    public void sayHello() {
//        System.out.println("b");
//    }
}
