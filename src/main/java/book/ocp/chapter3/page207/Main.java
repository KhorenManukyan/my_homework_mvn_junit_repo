package book.ocp.chapter3.page207;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        list.replaceAll(x -> x * 3);
        System.out.println(list);

        List<String> cats = Arrays.asList("Annie", "Ripley");
        for (String cat: cats){
            System.out.println(cat);
        }

        cats.forEach(c -> System.out.println(c));

    }
}
