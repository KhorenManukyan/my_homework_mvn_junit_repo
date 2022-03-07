package thread.videos.telegramic.l15;

public class Hzor extends Thread {
    Integer id;

    public Hzor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
//        synchronized (id) {
//            System.out.println("ID - " + id);
//            System.out.println("next ID - " + (++id));
//            System.out.println("ID  - " + id);
//
//        }
        tpel(id);

    }

    private synchronized void tpel(Integer id) {
        System.out.println("ID - " + id);
        System.out.println("next ID - " + (++id));
        System.out.println("ID  - " + id);

    }
}
