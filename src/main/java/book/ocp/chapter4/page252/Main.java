package book.ocp.chapter4.page252;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name: list){
            if (name.length() == 4){
                filtered.add(name);
            }
        }

        Collections.sort(filtered);
        Iterator<String> iterator = filtered.iterator();
        if (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        if (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        if (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
