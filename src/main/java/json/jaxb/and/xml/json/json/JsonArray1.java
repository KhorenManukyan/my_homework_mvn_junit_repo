package json.jaxb.and.xml.json.json;

import org.json.simple.JSONArray;

public class JsonArray1 {
    public static void main(String[] args) {
        JSONArray array = new JSONArray();
        array.add("sonoo");
        array.add(27);
        array.add(600000.);
        System.out.println(array);
    }
}
