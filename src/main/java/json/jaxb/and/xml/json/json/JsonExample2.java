package json.jaxb.and.xml.json.json;

import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonExample2<T> {
    public static void main(String[] args) {
        Map<String,Object>  map = new HashMap<>();
        map.put("name","sonoo");
        map.put("age", 27);
        map.put("salary", 600000.);
        String jsonTest = JSONObject.toJSONString(map);
        System.out.println(jsonTest);
    }
}
