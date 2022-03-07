package intermediateTigran.lesson6.lyambda.udemy.lesson1;

public interface Executable2 {
    int execute(int x, int y);
}

class Runner2 {
    public void run(Executable2 e) {
        int a = e.execute(15, 10);
        System.err.println(a);
    }
}

class Test2 {
    public static void main(String[] args) {
        Runner2 runner1 = new Runner2();

        runner1.run(new Executable2() {
            @Override
            public int execute(int x, int y) {
                System.out.println("hello");
                System.out.println("goodbye");
                return x + y;
            }
        });

        runner1.run((x, y) -> {
            System.out.println("hello");
            System.out.println("goodbye");
            return x + y;
        });

        int a = 1;
        runner1.run((x, y) -> x + y + a);
    }
}
