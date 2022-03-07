package youtube.videos.uroki.java.java8.l333;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
            list.add(10_000_000 - i);
        }

        System.out.println(new Date());
        list.parallelStream().filter(x->x % 2 ==0).map(x->new Double(x)).forEach(t -> t.toString(t));
        System.out.println(new Date());
    }
}
