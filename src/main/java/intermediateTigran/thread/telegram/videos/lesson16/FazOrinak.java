package intermediateTigran.thread.telegram.videos.lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Phaser;

public class FazOrinak extends Thread {
    Phaser pul;
    static List<Integer> list = new ArrayList<>();

    static int i = 0;

    public FazOrinak(Phaser pul) {
        this.pul = pul;
    }

    @Override
    public void run() {
        pul.register();
        //----------
        list.add(++i);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pul.arriveAndAwaitAdvance();


        list.add(new Random().nextInt());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }









        //-------------
        pul.arriveAndDeregister();
    }
}
