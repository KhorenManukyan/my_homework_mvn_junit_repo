package thread.videos.telegramic.l15;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 15; ++i) {
//            new Baza().start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Hzor(i).start();
        }


        for (Integer tiv: Baza.list){
//            System.out.println(tiv);
        }
    }
}
