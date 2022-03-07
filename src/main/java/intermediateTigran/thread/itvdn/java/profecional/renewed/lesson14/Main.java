package intermediateTigran.thread.itvdn.java.profecional.renewed.lesson14;


public class Main extends Thread{
    private String word;
    private int delay;

    private Main(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }


    @Override
    public void run() {
//        int x;
        for (int i = 0; i <         22; i++) {
            System.out.println(i);
        }
        for (;;) {
            System.out.println(word + "  ");
            try {
                sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            if(x<100) System.out.println();
        }
    }

    public static void main(String[] args) {
        Main ping = new Main("ping", 33);
        Main pong = new Main("PONG", 33);

        Thread thread1 = new Thread(ping);
        Thread thread2 = new Thread(pong);

        thread1.start();
        thread2.start();

    }
}
