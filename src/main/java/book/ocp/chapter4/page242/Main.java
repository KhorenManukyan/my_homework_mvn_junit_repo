package book.ocp.chapter4.page242;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(stream.count());

        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Stream<String> s5 = Stream.of();
        Optional<String> min1 = s5.min((s1, s2) -> 0);
        min1.ifPresent(System.out::println);
        Optional<String> max = s.max((s1, s2) -> s1.length() -s2.length());
        max.ifPresent(System.out::println);

        Stream<String> st = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(()-> "chimp");
        st.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);
        List<String> list = Arrays.asList("monkey", "abo", "chimp");
        Stream<String> infinite1 = Stream.generate(()->"chimp");
        Predicate<String> predicate = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(predicate));
        System.out.println(list.stream().allMatch(predicate));
        System.out.println(list.stream().noneMatch(predicate));
        System.out.println(infinite1.anyMatch(predicate));
    }
}
