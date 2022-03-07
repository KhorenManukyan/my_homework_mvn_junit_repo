package intermediateTigran;

import java.time.LocalDate;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Supplier<LocalDate> l = LocalDate::now;
        Supplier<LocalDate> l2 = ()->LocalDate.now();

        LocalDate date = l.get();
        LocalDate date2 = l2.get();

        Supplier<StringBuilder> s1 = StringBuilder::new;

//        System.out.println(s1.get());

        Consumer<String> c1 = System.out::println;
        c1.accept("Hamlet");

        Predicate<String> p1 = String::isEmpty;
        System.out.println(p1.test(" "));

        BiPredicate<String ,String > p2 = String::startsWith;
        System.out.println(p2.test("animal", "a"));

        Function<String , Integer> f = String::length;
        Integer java = f.apply("java");
        System.out.println(java);

        BiFunction<String ,String ,Integer > biFunction = String::compareToIgnoreCase;
        Integer apply = biFunction.apply("java", "Java");
        System.out.println(apply);


    }
}
