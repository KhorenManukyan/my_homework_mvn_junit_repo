package thread.producer.consumer;

public class Consumer implements Runnable {
    Warehouse warehouse;

    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        warehouse.consume();
    }
}
