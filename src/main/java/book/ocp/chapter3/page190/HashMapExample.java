package book.ocp.chapter3.page190;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        map.put("koala","bamboo");
        map.put("lion","meat");
        map.put("giraffe","leaf");
        String food = map.get("koala");
        for (String s : map.keySet()) {
            System.out.print(s + ", ");
        }

      //  System.out.println(map.contains("lion")); // DOES NOT COMPILE
        System.out.println(map.containsKey("lion")); // true
        System.out.println(map.containsValue("lion")); // false
        System.out.println(map.size()); // 3
    }
}
