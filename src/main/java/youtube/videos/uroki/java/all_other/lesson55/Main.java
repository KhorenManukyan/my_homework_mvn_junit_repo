package youtube.videos.uroki.java.all_other.lesson55;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
        Set<Integer> set = new TreeSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(6);
        set.add(2);
        set.add(5);
        set.add(2);
        set.add(9);
        set.add(3);
        set.add(5);
        set.add(2);
        for (Integer i: set){
            System.out.println(i);
        }

    }
}
