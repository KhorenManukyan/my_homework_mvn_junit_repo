package intermediateTigran.thread.telegram.videos.lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class SemiOrinak extends Thread{
    Semaphore semi;
    static int i = 0;
    static List<Integer> tver = new ArrayList<>();

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
        System.out.println("id : " + i);
        System.out.println("us :  " + semi.availablePermits());

        semi.release(1);
        tver.add(new Random().nextInt());
        System.out.println("id : " + i);
        System.out.println("size : " + tver.size());
        System.out.println("us :  " + semi.availablePermits());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semi.release(1);
    }
}

















