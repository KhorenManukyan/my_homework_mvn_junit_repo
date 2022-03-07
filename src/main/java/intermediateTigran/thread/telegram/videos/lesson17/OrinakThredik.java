package intermediateTigran.thread.telegram.videos.lesson17;

import java.util.concurrent.CountDownLatch;

public class OrinakThredik extends Thread {
    CountDownLatch cdl;
    String name;

    public OrinakThredik(CountDownLatch cdl, String name) {
        this.cdl = cdl;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("gorcume e :" + name + ", count : " + cdl.getCount() + ", id + " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (cdl.getCount() > 0) {
                cdl.countDown();
            }
        }
    }
}
