package intermediateTigran.thread.itvdn.java.profecional.renewed.lesson13.with.synchronization;

public class Ticket {
    boolean isBought;
    int place;

    public Ticket(int place) {
        this.place = place;
    }

    void buy(Cashier cashier) {
        synchronized (Ticket.class ) {
            if (!isBought) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                isBought = true;
                System.out.println("Cashier " + cashier.id + ", ticket" + this.place);
            }
        }
    }
}
