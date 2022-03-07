package intermediateTigran.lesson6.lyambda.itvdn.calculateLyambda.without.lyambda;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int z = operation.calculate(20,30);
        System.out.println(z);
    }
}
