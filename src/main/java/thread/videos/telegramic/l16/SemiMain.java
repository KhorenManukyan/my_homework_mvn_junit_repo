package thread.videos.telegramic.l16;

import java.util.concurrent.Semaphore;

public class SemiMain {
    public static void main(String[] args) {
        Semaphore semi = new Semaphore(2);
        for (int i = 0; i < 1000; i++) {
            new SemiOrinak(semi).start();
        }

        try {
            Thread.sleep(5000);
            System.out.println(SemiOrinak.tver.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
