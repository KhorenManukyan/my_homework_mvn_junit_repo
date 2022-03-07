package youtube.videos.uroki.java.all_other.lesson29;

public class OverloadingExample1 {
    private short sh = 7;
    public static void main(String[] args) {
        OverloadingExample1 overloadingExample = new OverloadingExample1();
        overloadingExample.method(overloadingExample.sh);
    }


    void method(Integer sh){
        System.out.println("long");
    }
    void method(short... sh){
        System.out.println("int");
    }
//
//    void method(Object... sh){
//        System.out.println("int");
//    }
}

