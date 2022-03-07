package youtube.videos.uroki.java.all_other.lesson49;

public class Main {
    int value;
    public static void main(String[] args) {
        Main main = new Main();
        main.value = 8;
        System.out.println(main);
        System.out.println(main.getClass());
    }

    @Override
    public String toString() {
        return "value = " + value;
    }
}
