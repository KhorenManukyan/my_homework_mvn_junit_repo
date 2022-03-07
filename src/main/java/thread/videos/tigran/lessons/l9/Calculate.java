package thread.videos.tigran.lessons.l9;

public class Calculate implements Runnable{
    @Override
    public void run() {
        System.out.println("hello from calculate thread!!!");
        System.out.println(Thread.currentThread().getName());
    }
}
