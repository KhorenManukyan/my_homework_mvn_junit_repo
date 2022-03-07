package intermediateTigran.thread.telegram.videos.lesson17;

import java.util.concurrent.Exchanger;

public class Vacharox extends Thread {
    Exchanger<String> exchanger;

    public Vacharox(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            String gumar = exchanger.exchange("shokolad");

            System.out.println("es shokolad dimac staca : " + gumar);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
