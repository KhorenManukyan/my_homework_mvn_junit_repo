package youtube.videos.uroki.java.all_other.lesson29;

public class OverloadingExample {
    private double sh = 55;

    public static void main(String[] args) {
        OverloadingExample overloadingExample = new OverloadingExample();
        overloadingExample.method(overloadingExample.sh);
    }


    void method(float sh) {
        System.out.println("float");
    }

    void method(long sh) {
        System.out.println("long");
    }

    void method(byte sh) {
        System.out.println("byte");
    }

    void method(int sh) {
        System.out.println("int");
    }

    void method(short sh) {
        System.out.println("short");
    }

    //    void method(double sh){
//        System.out.println("double");
//    }
    void method(boolean sh) {
        System.out.println("boolean");
    }

    void method(byte... sh) {
        System.out.println("byte...");
    }

    void method(short... sh) {
        System.out.println("short...");
    }

    //    void method(int... sh){
//        System.out.println("int... ");
//    }
    void method(Integer... sh) {
        System.out.println("Integer...");
    }

    void method(Double... sh) {
        System.out.println("Double...");
    }

    void method(long... sh) {
        System.out.println("long...");
    }

    void method(float... sh) {
        System.out.println("float...");
    }

    void method(char... sh) {
        System.out.println("char...");
    }

    void method(boolean... sh) {
        System.out.println("boolean...");
    }

    void method(Object... sh) {
        System.out.println("Object...");
    }

    void method(Byte sh) {
        System.out.println("Byte");
    }

    void method(Short sh) {
        System.out.println("Short");
    }

    void method(Integer sh) {
        System.out.println("Integer");
    }

    void method(Long sh) {
        System.out.println("Long");
    }

    void method(Float sh) {
        System.out.println("Float");
    }

    //    void method(Double sh){
//        System.out.println("Double");
//    }
    void method(double... sh) {
        System.out.println("double...");
    }

    void method(Character sh) {
        System.out.println("Character");
    }

    void method(Boolean sh) {
        System.out.println("Boolean");
    }

    void method(Object sh) {
        System.out.println("Object");
    }
}
