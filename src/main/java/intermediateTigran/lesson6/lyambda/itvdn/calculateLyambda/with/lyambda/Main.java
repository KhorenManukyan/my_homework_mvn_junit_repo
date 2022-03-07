package intermediateTigran.lesson6.lyambda.itvdn.calculateLyambda.with.lyambda;

import intermediateTigran.lesson6.lyambda.itvdn.calculateLyambda.without.lyambda.Operation;

public class Main {
    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation div = (x, y) -> x / y;
        Operation multiple = (x, y) -> x * y;
        int resultAdd = add.calculate(20, 30);
        int resultSub = sub.calculate(20, 30);
        int resultDiv = div.calculate(20, 30);
        int resultMultiple = multiple.calculate(20, 30);
        System.out.println(resultAdd);
        System.out.println(resultSub);
        System.out.println(resultDiv);
        System.out.println(resultMultiple);
    }
}
