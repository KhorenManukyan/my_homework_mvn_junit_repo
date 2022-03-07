package youtube.videos.uroki.java.java8.l328;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
/*
        for (String s : list) {
            System.out.println(s);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
*/


//        Stream<String> stream = list.stream();
//        stream.forEach(x-> System.out.println(x));
////        stream.forEach(x-> System.out.println(x));


//        list.stream().forEach(x-> System.out.println(x));


//        Set<String> set = list.stream().collect(Collectors.toSet());


//        list.stream().map(x-> x.toUpperCase()).forEach(System.out::println);


//        Stream.of(asList("one", "two"),asList("three", "four")).flatMap(x->x.stream()).forEach(System.out::print);


//        int value = Stream.of(1,2,3).min(Comparator.comparing(x->x)).get();
//        int value1 = Stream.of(1,2,3).max(Comparator.comparing(x->x)).get();
//        System.out.println(value);
//        System.out.println(value1);


//        int count = Stream.of(1,2,3).reduce(0,(acc, element)-> acc + element)/*.get()*/;
//        System.out.println(count);


//        Stream<String> one = Stream.of("one", "two", "three");
//        System.out.println(one.sorted((x, y) -> x.compareTo(y)).collect(Collectors.toList()));


//        Stream.of("one", "two", "three").limit(6).forEach(System.out::println);


//        Stream.of("one", "two", "one", "two", "three").distinct().forEach(System.out::println);


//        Stream.of("one", "two", "three").skip(1).forEach(System.out::println);


//        System.out.println(Stream.of("one", "two", "three").filter(x -> x.equals("one")).findAny().get());
//        System.out.println(Stream.of("one", "two", "three").filter(x -> x.equals("one")).findAny().isPresent());

//        System.out.println(Stream.of(1, 2, 3).skip(1).mapToInt(x -> x).sum());
//        System.out.println(Stream.of(1, 2, 3).count());


        System.out.println(Stream.of("one", "two", "three").peek(s -> s.toUpperCase()).findFirst().get());



    }
}
