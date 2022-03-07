package intermediateTigran.lesson6.stream.itvdn.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> collect = Arrays.asList(10, -20, 30, 40, 30)
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);


        Stream<Integer> integerStream = Stream.of(30, 14, 20)
                .sorted()
                .distinct();
        integerStream.forEach(System.out::println);

        String[] arr = {"Khoren", "Karine", "Vlad"};
        Stream<String> distinct = Arrays.stream(arr).sorted().distinct();
        distinct.forEach(System.out::println);

        Stream<Object> build = Stream.builder()
                .add(10)
                .add(20)
                .add(30)
                .build();

        build.forEach(System.out::println);

        IntStream chars = "Hello".chars();
        chars.forEach(System.out::print);


    }
}
