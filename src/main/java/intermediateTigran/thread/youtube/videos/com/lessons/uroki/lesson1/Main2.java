package intermediateTigran.thread.youtube.videos.com.lessons.uroki.lesson1;

public class Main2 {
    public static void main(String[] args) {
        new MyThread1().start();
        new MyThread1().start();
        new MyThread1().start();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            System.out.println("Thread name is " + Thread.currentThread().getName() + " i= " + i);
        }
    }
}

