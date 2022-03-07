package java.ot.prostogo.k.slojnomu.lesson10.concurence;

public class ConcurrentMain {
    public static void main(String[] args) {
        ExampleThread simpleThread1 = new ExampleThread();
        simpleThread1.start();
    }
}

class ExampleThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Info - " + currentThread().getName() + " - " + i);
        }
    }
}
