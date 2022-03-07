package intermediateTigran.thread.itvdn.java.profecional.lesson12;

public class MainPC {
    public static void main(String[] args) {
        SyncStack stack = new SyncStack();
        Producer producer1 = new Producer(stack);
        Thread prodT1 = new Thread(producer1);
        prodT1.start();

        Producer producer2 = new Producer(stack);
        Thread prodT2 = new Thread(producer2);
        prodT2.start();

        Consumer consumer1 = new Consumer();
        Thread consT1 = new Thread(consumer1);
        consT1.start();

        Consumer consumer2 = new Consumer();
        Thread consT2 = new Thread(consumer2);
        consT2.start();
    }
}
