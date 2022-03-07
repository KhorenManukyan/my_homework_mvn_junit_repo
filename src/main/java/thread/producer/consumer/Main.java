package thread.producer.consumer;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Runnable producer = new Producer(warehouse);
        Thread producerThread = new Thread(producer);

        Runnable consumer = new Consumer(warehouse);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
