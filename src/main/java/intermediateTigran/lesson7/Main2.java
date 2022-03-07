package intermediateTigran.lesson7;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
//        Thread intermediateTigran.thread = new Thread(counter);

//        System.out.println(counter.count);

        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());

            for (int i = 0; i < 1000000; i++) {
                counter.increment();
            }
        });
//        System.out.println(counter.count);

        Thread thread2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());

            for (int i = 0; i < 1000000; i++) {
                counter.increment();
            }
        });

//        intermediateTigran.thread.start();
//        intermediateTigran.thread.join();

        thread1.start();
        thread2.start();
//        System.out.println(counter.count);
        thread1.join();
        thread2.join();
        System.out.println(counter.count);
    }
}

class Counter{
//    AtomicInteger count = new AtomicInteger(0);
    public int count = 0;
public synchronized void increment(){
    count++;
}

 /*   @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 1000; i++) {
            count++;
        }
    }*/
}