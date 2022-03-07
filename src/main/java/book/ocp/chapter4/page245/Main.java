package book.ocp.chapter4.page245;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(a -> System.out.print(a));
        System.out.println();

        String[] array = new String[] { "w", "o", "l", "f" };
        String result = "";
        for (String ss: array){
            result +=ss;
        }
        System.out.println(result);

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("",(sss,c)-> sss +c);
        System.out.println(word);
    }
}
