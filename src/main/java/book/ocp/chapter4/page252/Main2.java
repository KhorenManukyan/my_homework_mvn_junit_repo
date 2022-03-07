package book.ocp.chapter4.page252;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex", "Baba");
        Stream<String> stream = Stream.of("Toby", "Anna", "Leroy", "Alex", "Baba");
//        list.stream().filter(n->n.length() ==4).sorted().limit(2).forEach(System.out::println);
        stream.filter(n->n.length() ==4)
                .sorted()
//                .limit(2)
                .filter(n->n.startsWith("T"))
                .forEach(System.out::println);
    }
}
