package intermediateTigran.thread.itvdn.java.profecional.renewed.lesson13.without.synchronization;

public class Cashier extends Thread {
    int id;
    Ticket[] t;

    public Cashier(int id, Ticket[] t) {
        this.id = id;
        this.t = t;
    }

    @Override
    public void run() {
        for (int i = 0; i < t.length; i++) {
            if (!t[i].isBought) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                t[i].isBought = true;
                System.out.println("Cashier " + id + ", ticket" + t[i].place);
            }

        }
    }
}
