package thread.videos.youtube.uroki.po.java.l66;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("this is my new thread!!!");
        someMethod();
    }

    private void someMethod(){
        throw new RuntimeException();
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("this is class MyRunnable!!!");
    }
}


