package intermediateTigran.thread.telegram.videos.lesson17;

import java.util.concurrent.CountDownLatch;

public class cdlMain {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(3);

        new OrinakThredik(cdl," X").start();

        try {
            cdl.await();
            new OrinakThredik(cdl," Y").start();
//            new OrinakThredik(cdl," Z").start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
