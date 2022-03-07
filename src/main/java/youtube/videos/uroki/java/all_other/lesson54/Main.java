package youtube.videos.uroki.java.all_other.lesson54;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map map2 = new HashMap();
        Map map = new Hashtable();
        Map map3 = new LinkedHashMap();
        Map map1 = new TreeMap();
        map.put("1", "one");
        map.put("3", "three");
        map.put("2", "two");
        System.out.println(map.get("3"));
        Set set = map.entrySet();
        for (Object o: set){
            System.out.println(o);
        }
    }
}
