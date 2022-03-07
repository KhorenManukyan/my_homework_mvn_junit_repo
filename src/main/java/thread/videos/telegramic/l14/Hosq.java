package thread.videos.telegramic.l14;

public class Hosq extends AshxatanqiKanonner implements Runnable{
    @Override
    public void run() {
        for (int i = 5; i > 0; --i) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hosq gorcum e q ID = " + i);
        }
    }
}
