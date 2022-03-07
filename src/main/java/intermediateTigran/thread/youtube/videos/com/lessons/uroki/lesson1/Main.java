package intermediateTigran.thread.youtube.videos.com.lessons.uroki.lesson1;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());

        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

//        System.out.println("This is new intermediateTigran.thread!!!");
//        simpleThread();
    }

//    private void simpleThread(){
//        throw new RuntimeException();
//    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
