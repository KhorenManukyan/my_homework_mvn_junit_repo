package intermediateTigran.thread.telegram.videos.lesson14;

public class Hosq extends Thread{ //AshxatnaqiKanonner implements Runnable{

    public boolean stop = false;

    @Override
    public void run() {
        for (int i = 0; !stop; i++) {


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("Hosq@ gorcum e q ID = " + i);
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
