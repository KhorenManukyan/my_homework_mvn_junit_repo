package youtube.videos.uroki.java.all_other.lesson56;

public class Main {
    @Override
    public String toString() {
        return "MainStack{}";
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.method(5));

    }

    private <T> T method(T t) {
        System.out.println(t);
        return t;
    }
}
