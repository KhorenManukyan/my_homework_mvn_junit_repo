package intermediateTigran.lesson6.lyambda.udemy.lesson1;

@FunctionalInterface
public interface Executable {
    void execute();
    default void eee(){}

}

class Runner{
    public void run(Executable e){
        e.execute();
    }
}

class ExecutableImplementation implements Executable{
    @Override
    public void execute() {
        System.out.println("Hello!");
    }
}

class Tests{
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new ExecutableImplementation());

        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello111!!!");
            }
        });

        runner.run(() -> System.out.println("hello222~~~"));
    }
}

















