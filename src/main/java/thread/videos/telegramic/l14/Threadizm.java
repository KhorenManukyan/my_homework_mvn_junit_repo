package thread.videos.telegramic.l14;

public class Threadizm {
    public static void main(String[] args) {
//        Thread orinak = new Thread();
        System.out.println("START!");
        Hosq hosq = new Hosq();
        Hosq hosq1 = new Hosq();
        Thread thread1 = new Thread(hosq);
        Thread thread2 = new Thread(hosq1);

        thread1.start();
        thread2.start();
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            //log++
        }

        try {
            thread1.join();
            System.out.println(thread2.isAlive() ? "saxa" : "chka");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("END!");


    }
}
