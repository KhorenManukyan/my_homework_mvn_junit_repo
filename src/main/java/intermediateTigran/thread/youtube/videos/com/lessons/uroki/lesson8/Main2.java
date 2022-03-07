package intermediateTigran.thread.youtube.videos.com.lessons.uroki.lesson8;

public class Main2 {
    public static void main(String[] args) {
        ResourceAA resourceAA = new ResourceAA();
        ResourceBB resourceBB = new ResourceBB();
        resourceAA.resourceBB = resourceBB;
        resourceBB.resourceAA = resourceAA;
        MySecondThread1 mySecondThread1 = new MySecondThread1();
        MySecondThread2 mySecondThread2 = new MySecondThread2();
        mySecondThread1.resourceAA = resourceAA;
        mySecondThread2.resourceBB = resourceBB;
        mySecondThread1.start();
        mySecondThread2.start();
    }
}

class MySecondThread1 extends Thread {
    ResourceAA resourceAA;

    @Override
    public void run() {
        System.out.println(resourceAA.getI());
    }
}

class MySecondThread2 extends Thread {
    ResourceBB resourceBB;

    @Override
    public void run() {
        System.out.println(resourceBB.getI());
    }
}

class ResourceAA {
    ResourceBB resourceBB;

    public synchronized int getI() {
        return resourceBB.removeI();
    }

    public synchronized int removeI() {
        return 11;
    }
}

class ResourceBB {
    ResourceAA resourceAA;

    public synchronized int getI() {
        return resourceAA.removeI();
    }

    public synchronized int removeI() {
        return 10;
    }
}
