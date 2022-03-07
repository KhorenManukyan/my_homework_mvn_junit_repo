package thread.videos.tigran.lessons.l9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainExecutorService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5)/*newSingleThreadExecutor()*/;
        for (int i = 0; i < 10; i++) {
            service.execute(()->{
                System.out.println("hello java");
                System.out.println(Thread.currentThread().getName());
            });
        }


        for (int i=0; i<10;i++){
            new Thread(()->{
                System.out.println("HELLO WORLD!!!!!!!!!!!");
                System.out.println(Thread.currentThread().getName());
            }).start();
        }
    }

}
