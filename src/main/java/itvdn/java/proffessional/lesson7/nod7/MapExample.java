package itvdn.java.proffessional.lesson7.nod7;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map word_count_map = new HashMap();
        FileReader reader = null;
        Iterator words = new WordStreamIterator(reader);
    }
}
