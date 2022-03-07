package youtube.videos.uroki.java.all_other.lesson57;

public class Main {
    private int i = 5;
    private static int q = 8;

    static class StaticClass{
        void methodSt(){
            System.out.println("Staticum sovorakan - " +q);
        }

        static void staticMethod(){
            System.out.println("Static - " + q);
        }
    }

    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();
        staticClass.methodSt();
        StaticClass.staticMethod();
        Main main = new Main();
        Inner inner1 = main.new Inner();
        main.methodClass();
        Inner inner = main.new Inner();
        System.out.println("Inner methodov - " + inner.k);
        inner.method2();
        main.method();
    }

    void methodClass(){
        class NewInner {
            void newInnerMethod() {
                System.out.println("NewInner - " + "blaaaa!!!");
            }
        }
            NewInner newInner = new NewInner();
            newInner.newInnerMethod();

    }

    void method(){
        Inner inner = new Inner();
        inner.method2();
        System.out.println("Inner methodov - " + inner.k);
    }

    class Inner {
        private int k = 6;

        void method2() {
            System.out.println("Inner methodov2 - " + i);
        }
    }
}
