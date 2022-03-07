package book.ocp.chapter4.page235;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        int[] a = {22, 23, 24,23,1};
//        System.out.println(average(a));
        Optional<Double> opt = average(90,100,101);
        if (opt.isPresent()){
            System.out.println(opt.get());
        }
    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        Double value = (double) sum / scores.length;
        Optional o = (value == null)?Optional.empty(): Optional.of(value);
        return o;

    }
}
