package thread.videos.youtube.uroki.po.java.l67;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
//        Thread.yield();
//        myThread.setPriority(Thread.MIN_PRIORITY);
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        try {
//            Thread.sleep(1000);
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
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 0 - " + i);
        }
    }
}
