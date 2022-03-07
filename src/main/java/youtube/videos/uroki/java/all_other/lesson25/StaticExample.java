package youtube.videos.uroki.java.all_other.lesson25;

public class StaticExample extends Parent {
    static int i;
    int j;

    static {
        System.out.println("static init block!!!");
    }

    {
        System.out.println("Init block!!!");
    }

    StaticExample() {
        System.out.println("Constructor!!!");
    }

    static void method1(){
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        System.out.println("Staticic heto");
        new StaticExample();
        method1();
        new StaticExample();
        new StaticExample();
    }
}

class Parent {
    int a;

    Parent() {
        System.out.println("Parent constructor!!!");
    }

    public Parent(int a) {
        this.a = a;
    }

    public void method() {
        System.out.println("Parent method!!!");
    }
}
