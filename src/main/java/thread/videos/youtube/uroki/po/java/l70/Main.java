package thread.videos.youtube.uroki.po.java.l70;

public class Main {
    volatile static int i = 0;

    public static void main(String[] args) {
        new MyThreadRead().start();
        new MyThreadWrite().start();
    }

    static class MyThreadWrite extends Thread {
        @Override
        public void run() {
            synchronized (this){
                while (i < 5) {
                    System.out.println("increment i to " + (++i));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
//            meth();
        }

/*        private synchronized void meth() {
            while (i < 5) {
                System.out.println("increment i to " + (++i));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }

    static class MyThreadRead extends Thread {
        @Override
        public void run() {
            synchronized (this){
                int localVar = i;
                while (localVar < 5) {
                    if (localVar != i) {
                        System.out.println("new value of i is " + i);
                        localVar = i;
                    }
                }
            }
//            meth();
        }

/*        private synchronized void meth() {
            int localVar = i;
            while (localVar < 5) {
                if (localVar != i) {
                    System.out.println("new value of i is " + i);
                    localVar = i;
                }
            }
        }*/
    }
}


