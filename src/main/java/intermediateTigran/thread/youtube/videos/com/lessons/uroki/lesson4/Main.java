package intermediateTigran.thread.youtube.videos.com.lessons.uroki.lesson4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Resource.i = 5;
        MyThread myThread = new MyThread();
        myThread.setName("One");
        MyThread myThread2 = new MyThread();
        myThread.start();
        myThread2.start();
        myThread.join();
        myThread2.join();
        System.out.println(Resource.i);

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        Resource.staticChange();
    }
}

class Resource {
    static int i;


    public static void staticChange() {
        synchronized (Resource.class) {
            int i = Resource.i;

            if (Thread.currentThread().getName().equals("One")){
                Thread.yield();
            }
            i++;
            Resource.i = i;
        }
    }
}
