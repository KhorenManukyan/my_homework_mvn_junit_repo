package youtube.videos.uroki.java.all_other.l321;

public class Main {
    public static void main(String[] args) {
        try (MyClosable myClosable = new MyClosable()) {
            myClosable.doJob();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }
    }
}

class MyClosable implements AutoCloseable {

    MyClosable() throws Exception {
        System.out.println("constructor");
    }

    void doJob() throws Exception {
        System.out.println("do job");
        throw new Exception();
    }

    @Override
    public void close() throws Exception {
        System.out.println("close");
    }
}
