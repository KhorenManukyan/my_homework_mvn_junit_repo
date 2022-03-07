package intermediateTigran.thread.telegram.videos.lesson16;

import java.util.concurrent.Phaser;

public class FazMain {
    public static void main(String[] args) {
        Phaser pul = new Phaser();
        for (int i = 0; i < 1000; i++) {
            new FazOrinak(pul).start();

        }

        int hamar = pul.getPhase();
        System.out.println("id : " + hamar);
        System.out.println("size : " + FazOrinak.list.size());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pul.arriveAndAwaitAdvance();
        hamar = pul.getPhase();
        System.out.println("id : " + hamar);
        System.out.println("size : " + FazOrinak.list.size());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pul.arriveAndAwaitAdvance();

    }
}
