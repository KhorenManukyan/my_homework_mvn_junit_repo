package intermediateTigran.thread.youtube.videos.com.lessons.uroki.lesson3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.setI(5);

        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.setName("One");
        myThread.setResource(resource);
        myThread2.setResource(resource);
        myThread.start();
        myThread2.start();
        myThread.join();
        myThread2.join();
        System.out.println(resource.getI());
    }
}
