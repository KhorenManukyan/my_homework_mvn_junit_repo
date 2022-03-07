package book.ocp.chapter3.page199;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Comparator<Duck> byWeight = (o1, o2) -> o1.getWeight() - o2.getWeight();


        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        ducks.add(new Duck("Bob",44));
        ducks.add(new Duck("Kot",21));
        Collections.sort(ducks);
        System.out.println(ducks);
        Collections.sort(ducks,byWeight);
        System.out.println(ducks);
    }
}
