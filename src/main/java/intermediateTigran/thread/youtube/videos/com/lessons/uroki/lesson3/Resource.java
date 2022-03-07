package intermediateTigran.thread.youtube.videos.com.lessons.uroki.lesson3;

public class Resource {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void change() {
        synchronized (this) {
            int i = this.i;

            if (Thread.currentThread().getName().equals("One")){
                Thread.yield();
            }
            i++;
            this.i = i;
        }
    }
}
