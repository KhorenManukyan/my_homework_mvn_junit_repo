package book.ocp.chapter3.page204;

import book.ocp.chapter3.page199.Duck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DuckHelper {
    //    Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1,d2);
    Comparator<Duck> byWeight = DuckHelper::compareByWeight;

    Consumer<List<Integer>> methodRef1 = Collections::sort;
    Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);

    String str = "abc";
    Predicate<String> methodRef2 = str::startsWith;
    Predicate<String> lambda2 = s -> str.startsWith(s);

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Magician");
        list1.add("Assistant");
        list1.add("Dragon");
        list1.add("Koala");
        list1.add("Baby");
        list1.add("Acula");
        list1.add("Nsd");
        System.out.println(list1);
        list1.removeIf(s -> s.startsWith("A"));
        list1.removeIf(s -> s.startsWith("K"));
        System.out.println(list1);

    }

    public static int compareByWeight(Duck d1, Duck d2) {
        return d1.getWeight() - d2.getWeight();
    }

    public static int compareByName(Duck d1, Duck d2) {
        return d1.getName().compareTo(d2.getName());
    }
}
