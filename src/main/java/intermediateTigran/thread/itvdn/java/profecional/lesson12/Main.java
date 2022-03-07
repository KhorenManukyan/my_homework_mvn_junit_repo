package intermediateTigran.thread.itvdn.java.profecional.lesson12;

public class Main {
    public static void main(String[] args) {
//        ExampleThread exampleThread = new ExampleThread();
//        Thread intermediateTigran.thread = new Thread(exampleThread);
//        intermediateTigran.thread.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Hello from Thread : " + i);
                    if (i>15){
                        break;
                    }
                }
            }
        };
    }
}
    class ExampleThread implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello from Thread : " + i);
                if (i>15){
                    break;
                }
            }
        }
    }

