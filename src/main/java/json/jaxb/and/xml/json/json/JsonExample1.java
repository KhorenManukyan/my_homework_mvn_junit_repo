package json.jaxb.and.xml.json.json;

import org.json.simple.JSONObject;

public class JsonExample1 {
    public static void main(String[] args) {
        JSONObject object = new JSONObject();
        object.put("naem", "sonoo");
        object.put("age", 27);
        object.put("salary", 600000.);
        System.out.println(object);
    }
}
