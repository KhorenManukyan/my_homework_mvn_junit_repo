package thread.books.ocp;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                CheckResults.counter++;
            }
        }).start();

        while (CheckResults.counter<100){
            System.out.println("Not reached yet");
            Thread.sleep(1000);
        }

        System.out.println("Reached!");
    }
}
