package youtube.videos.uroki.java.java9.l5;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(list);

        Set<Integer> set = Set.of(1,2,3,4,5,6);
        System.out.println(set);

        Map<String,String > map = Map.of("key1","value2");
        System.out.println(map.get("key1"));
    }
}
