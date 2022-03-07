package zzz.examples;

import java.util.ArrayList;
import java.util.List;

public class Main extends AAAAAAAAAA {

    public static void main(String[] args) {
        List first, second;
        first = new ArrayList();
        first.add("Hello");
        second = first;
        second.add("World");

        System.out.println(first);
        System.out.print(second);
    }
}
