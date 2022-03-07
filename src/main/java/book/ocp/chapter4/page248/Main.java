package book.ocp.chapter4.page248;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x->x.startsWith("m")).forEach(System.out::println);
        Stream<String> st = Stream.of("duck", "duck", "duck", "goose");
        st.distinct().forEach(System.out::print);
    }
}
