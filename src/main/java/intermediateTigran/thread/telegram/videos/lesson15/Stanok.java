package intermediateTigran.thread.telegram.videos.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Stanok {
    List list = new ArrayList();

    int qanak;

    public Stanok(int qanak) {
        this.qanak = qanak;
    }

    public synchronized void add(Object st) {
        list.add(st);
        if (list.size() == qanak){
            this.notify();
        }
    }

    public synchronized void patetavorel() {
        while (true) {
            try {
                wait(5000);
                System.out.println("============");
                for (Object x : list) {
                    System.out.println();
                }
                this.list = new ArrayList();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }
    }
}
