package thread.videos.telegramic.l15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baza extends Thread {
    static List<Integer> list = new ArrayList<>();

    @Override
    public void run() {
        synchronized (list) {
            list.add(new Random().nextInt());
        }
    }
}
