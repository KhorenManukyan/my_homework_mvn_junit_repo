package intermediateTigran.lesson6.lyambda.udemy.lesson1;

public interface Executable1 {
    void execute();
}

class Runner1{
    public void run(Executable1 e){
        e.execute();
    }
}

class Test1{
    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();

        runner1.run(new Executable1() {
            @Override
            public void execute() {
                System.out.println("hello");
                System.out.println("goodbye");
            }
        });

        runner1.run(() ->{
            System.out.println("hello");
            System.out.println("goodbye");
        });
    }
}
