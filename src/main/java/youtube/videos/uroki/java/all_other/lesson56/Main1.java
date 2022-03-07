package youtube.videos.uroki.java.all_other.lesson56;


import java.util.Comparator;

class Car implements Comparable{
    @Override
    public String toString() {
        return "Cat{}";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class Main1<T extends Comparable> {
    T var;
    @Override
    public String toString() {
        return "MainStack{}";
    }

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        main1.var = new Car();
        System.out.println(main1.var);
//        System.out.println(main1.method(5));

    }

    private <T> T method(T t) {

        System.out.println(t);
        return t;
    }
}
