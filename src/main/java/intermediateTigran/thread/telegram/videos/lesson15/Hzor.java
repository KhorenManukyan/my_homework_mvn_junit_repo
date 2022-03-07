package intermediateTigran.thread.telegram.videos.lesson15;

public class Hzor extends Thread{
    Integer id;

    public Hzor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
                tpel(id);

//        System.out.println("-----------" + id);
    }

    private synchronized void tpel(Integer id) {
        System.out.println("id : " + id);
        System.out.println("next id : " + (++id));
        System.out.println("new id : " + id);
    }
}
