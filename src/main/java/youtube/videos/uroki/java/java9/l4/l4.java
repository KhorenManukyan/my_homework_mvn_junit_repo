package youtube.videos.uroki.java.java9.l4;

interface A {
    private void print(String s) {
        System.out.println(s);
    }

    default void printMessage(String s) {
        print(s);
    }
}

public class l4 {
    public static void main(String[] args) {
        A a = new A() {
        };
        a.printMessage("hello world");

    }
}
