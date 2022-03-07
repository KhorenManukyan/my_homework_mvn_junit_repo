package youtube.videos.uroki.java.all_other.lesson25;

public class StaticExample1 {

    static {
        System.out.println("static block...............");
    }

    static StaticExample1 staticExample1 = new StaticExample1();

    static {
        System.out.println("static block...............");
    }
    static int n = 4;
    static int i = returnIntStatic();
    static int k = 3;
    int j = returnInt();

    static {
        System.out.println("static block");
    }

    {
        System.out.println("init block");
    }

    StaticExample1(){
        System.out.println("constructor");
    }

    static int returnIntStatic() {
        System.out.println(n);
        System.out.println(k);
        System.out.println("return static int");
        return 1;
    }

    int returnInt() {
        System.out.println("return int");
        return 2;
    }

    public static void main(String[] args) {
        new StaticExample1();
    }
}
