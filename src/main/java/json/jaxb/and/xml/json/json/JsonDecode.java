package json.jaxb.and.xml.json.json;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonDecode {
    public static void main(String[] args) {
        String s="{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";
        Object object = JSONValue.parse(s);
        JSONObject jsonObject = (JSONObject) object;

        String name = (String) jsonObject.get("name");
        double salary = (double) jsonObject.get("salary");
        long age = (long) jsonObject.get("age");
        System.out.println(name + " " + salary + " " + age);
    }
}
