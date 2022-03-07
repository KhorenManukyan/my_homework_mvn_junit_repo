package thread.videos.telegramic.l15;

import java.util.Random;

public class StanokAshxatacnox extends Thread{
    static Stanok stanok = new Stanok(7);

    @Override
    public void run() {
        stanok.add(new Random().nextInt());
        stanok.patetavorel();
    }
}
