package thread.videos.youtube.uroki.po.java.l68;

public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource();
        resource.setI(5);

        MyThread myThread = new MyThread();
        myThread.setName("one");
        MyThread myThread2 = new MyThread();

        myThread.setResource(resource);
        myThread2.setResource(resource);
        myThread.start();
        myThread2.start();
        try {
            myThread.join();
            myThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(resource.getI());
    }
}

class MyThread extends Thread {
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeI();
    }
}

class Resource {
    private int i;

    public int getI(){
        return i;
    }

    public void setI(int i){
        this.i = i;
    }

    public void changeI() {
        synchronized (this) {
            int i = this.i;
            if (Thread.currentThread().getName().equals("one")) {
                Thread.yield();
            }
            i++;
            this.i = i;
        }
    }
}
