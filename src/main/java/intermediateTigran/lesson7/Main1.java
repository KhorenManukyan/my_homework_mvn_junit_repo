package intermediateTigran.lesson7;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName());
                System.out.println("Test");
        });
        thread.start();
    }
}
