package thread.videos.youtube.uroki.po.java.l74;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();
        synchronized (threadB){
            threadB.wait();
        }
        System.out.println(threadB.getTotal());
    }

    static class ThreadB extends Thread {
        private int total;

        public void setTotal(int total){
            this.total = total;
        }

        public int getTotal(){
            return total;
        }

        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 5; i++) {
                    total+= i;
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                notify();
            }
        }
    }
}
