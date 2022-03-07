package intermediateTigran.streams.streams;

import java.util.*;

public class StreamMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        Set<String > list = new LinkedHashSet<>();
        list.add(")))))");
        list.add(")))))");
        list.add("one*****1");
        list.add("two 2");
        list.add("three.....3");
        list.add("4");

 /*       list.stream().sorted().forEach(System.out::println);
        System.out.println("--------------------");
        list.stream().sorted((a, b) -> a.length() - b.length()).forEach(System.out::println);
        System.out.println("--------------------");
        list.stream().sorted((a, b) -> a.length() - b.length()).peek((text) -> System.out.println(text + " Khoreni patvin")).forEach(System.out::println);
        System.out.println("--------------------");
        list.stream().filter(text -> text.length()>4).forEach(System.out::println);
       */

        list.stream().skip(2).forEach(System.out::println);


        for (int i = 0; i < list.size() - 1; i++) {
            int x = list.get(i).length();
            int y = list.get(i + 1).length();
            if (x < y) {
                String temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, list.get(i));
                i = 0; //reset
            }
        }


    }
}
