package intermediateTigran.thread.itvdn.java.profecional.lesson12;

public class Consumer implements Runnable {
    int num = 0;
    SyncStack theStack = new SyncStack();

    public void run() {
        char c;
        for (int i = 0; i < 200; i++) {
            c = theStack.pop();

            System.out.println("Consumer" + num + ": " + c);
            try {
                Thread.sleep((int)(Math.random()*300));
            } catch (InterruptedException e){
                //
            }
        }
    }
}
