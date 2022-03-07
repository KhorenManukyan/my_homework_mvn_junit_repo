package intermediateTigran.lesson7;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        Test1 t1 = new Test1();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

        Thread th = new Thread(t);
        Thread th1 = new Thread(t1);

        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
            System.out.println("Test");
        });
        thread.start();
        thread.join();
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
            System.out.println("Test");
        };

        th.start();
        th.join();
        th1.start();
//        th1.join();

    }
}

class Test implements Runnable{//extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println("Test");
//        sleep();
    }
}

class Test1 implements Runnable{//extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println("Test");
//        sleep();
    }
}
