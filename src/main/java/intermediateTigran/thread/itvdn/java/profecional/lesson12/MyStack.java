package intermediateTigran.thread.itvdn.java.profecional.lesson12;

public class MyStack {
    int idx = 0;
    char[] data = new char[6];

    public void push(char c) {
        synchronized (this) {
            data[idx] = c;
            idx++;
        }
    }

    public char pop() {
        idx--;
        return data[idx];
    }
}
