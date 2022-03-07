package thread.videos.tigran.lessons.l9;

public class MainCalculate {
    public static void main(String[] args) {
//        Calculate calculate = new Calculate();
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new Calculate());
        
        thread.start();
        System.out.println(Thread.currentThread().getName());

    }
}
