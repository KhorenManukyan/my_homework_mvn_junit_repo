package intermediateTigran.thread.telegram.videos.lesson17;

import java.util.concurrent.Exchanger;

public class Gnord extends Thread {
    Exchanger<String> exchanger;

    public Gnord(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            String gumariDimac = exchanger.exchange("$100");

            System.out.println("es $100 dimac staca : " + gumariDimac);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
