package thread.producer.consumer;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<String> arrayList = new ArrayList<>();
    private int capacity = 8;

    public void produce() {
        int productNumber = 0;

        while (true){
            synchronized (this){
                while (arrayList.size() == capacity){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("produced: " + productNumber);
                arrayList.add("" + productNumber++);
                notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void consume(){
        while (true){
            synchronized (this){
                while (arrayList.isEmpty()){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("consumed: " + arrayList.get(0));
                arrayList.remove(0);
                notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
