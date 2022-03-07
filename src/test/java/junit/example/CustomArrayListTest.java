package junit.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayListTest {
    @Test
    public void testListInit(){
        List<String> list = new ArrayList<>();
//        Assertions.assertTrue(list.isEmpty());
//        Assertions.assertTrue(list.size()==0);
    }

    @Test
    public void testAddElement(){
        List<String> list = new ArrayList<>();
        list.add(0, "H");
        list.add(1, "E");
        list.add(2, "L");
        list.add(3, "L");
        list.add(4, "O");

        Assertions.assertEquals("H", list.get(0));

        Assertions.assertTrue(list.size() == 5);
    }
}
