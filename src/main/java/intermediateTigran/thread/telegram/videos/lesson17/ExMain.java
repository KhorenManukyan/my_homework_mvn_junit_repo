package intermediateTigran.thread.telegram.videos.lesson17;

import java.util.concurrent.Exchanger;

public class ExMain {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();

        Gnord gnord = new Gnord(ex);
        Vacharox vacharox = new Vacharox(ex);
        gnord.start();
        vacharox.start();
    }
}
