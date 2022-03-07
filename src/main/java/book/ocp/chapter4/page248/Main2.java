package book.ocp.chapter4.page248;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, n -> n + 1);
        stream.skip(5).limit(3).forEach(System.out::print);
        System.out.println();
        Stream<String> stream1 = Stream.of("monkey", "gorilla", "bonobo");
        stream1.map(String::length).forEach(System.out::println);

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gogo");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(l -> l.stream()).forEach(System.out::println);
        System.out.println();
        Stream<String> s = Stream.of("brown-", "bear-", "monkey", "gorilla", "bonobo");
//        s.sorted().forEach(System.out::println);
        s.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
