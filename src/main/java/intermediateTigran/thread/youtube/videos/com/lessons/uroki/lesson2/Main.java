package intermediateTigran.thread.youtube.videos.com.lessons.uroki.lesson2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();
//        myThread.MAX_PRIORITY;
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("Thread main");
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + " - ");
        }
    }
}
