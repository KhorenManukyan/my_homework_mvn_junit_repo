package book.ocp.chapter4.page229;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        BiPredicate<String,String> biPredicate1 = String::startsWith;
        BiPredicate<String,String> biPredicate2 = (string, prefix) ->string.startsWith(prefix);

        System.out.println(biPredicate1.test("chicken", "chick"));
        System.out.println(biPredicate2.test("chicken", "chick"));
    }
}
