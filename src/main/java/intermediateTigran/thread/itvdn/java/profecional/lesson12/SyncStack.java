package intermediateTigran.thread.itvdn.java.profecional.lesson12;

import java.util.ArrayList;
import java.util.List;

public class SyncStack {
    private List buffer = new ArrayList(15);

    public synchronized char pop() {
        char c;
        while (buffer.size() == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        c = ((Character)buffer.remove(buffer.size()-1)).charValue();
        return c;
    }

    public synchronized void push(char c) {
        this.notify();
        Character charObj = new Character(c);
        buffer.add(charObj);
    }
}
