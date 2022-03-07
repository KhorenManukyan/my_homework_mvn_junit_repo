package thread.videos.telegramic.l16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class SemiOrinak extends Thread {
    static List<Integer> tver = new ArrayList<>();
    static int i = 0;
    Semaphore semi;

    public SemiOrinak(Semaphore semi) {
        this.semi = semi;
    }

    @Override
    public void run() {
        try {
            semi.acquire(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tver.add(++i);

        System.out.println("Id : " + i);
        System.out.println("Us : " + semi.availablePermits());
        semi.release(1);
        tver.add(new Random().nextInt());
        System.out.println("Id : " + i);

        System.out.println("size" + tver.size());
        System.out.println("Us : " + semi.availablePermits());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semi.release(1);


    }
}
