package thread.producer.consumer;

public class Producer implements Runnable {
    Warehouse warehouse;

    public Producer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        warehouse.produce();
    }
}
