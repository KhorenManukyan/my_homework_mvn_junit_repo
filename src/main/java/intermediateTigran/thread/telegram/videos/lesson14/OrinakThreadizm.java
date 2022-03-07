package intermediateTigran.thread.telegram.videos.lesson14;

public class OrinakThreadizm {
    public static void main(String[] args) {
        System.out.println("Start!");
//        Thread x = new Thread(new Hosq());
//        Thread y = new Thread(new Hosq());
        Hosq x = new Hosq();
        Hosq y = new Hosq();
        x.start();
        y.start();
//        y.stop();
        try {
            Thread.sleep(3 * 1000);
            y.setStop(true);
            x.setStop(true);
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }

        try {
            y.join();
            System.out.println(y.isAlive()?"saxa":"chka!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End!");

    }
}
