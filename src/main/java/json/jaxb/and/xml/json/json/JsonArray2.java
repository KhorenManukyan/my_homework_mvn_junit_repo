package json.jaxb.and.xml.json.json;

import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.List;

public class JsonArray2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("sonoo");
        list.add(30);
        list.add(500000.);
        String jsonText = JSONValue.toJSONString(list);
        System.out.println(jsonText);
    }
}
