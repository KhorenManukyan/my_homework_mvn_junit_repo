package intermediateTigran.thread.itvdn.java.profecional.lesson12;

public class Producer implements Runnable{
    int num = 0;
    SyncStack theStack;

    public Producer(SyncStack theStack) {
        this.theStack = theStack;
    }

    public void run() {
        char c;
        for (int i = 0; i < 200; i++) {
            c = (char) (Math.random() * 26 + 'A');

            theStack.push(c);

            System.out.println("Producer" + num + ": " + c);
            try {
                Thread.sleep((int)(Math.random()*300));
            } catch (InterruptedException e){
                //
            }
        }
    }
}
