package json.jaxb.and.xml.json.json;

import org.json.simple.JSONValue;

public class MyJsonExample {
    public static void main(String[] args) {
//        JSONObject jsonObject = new JSONObject();
        User user = new User(1, "Khoren", "999");
        String str = JSONValue.toJSONString(user);
        System.out.println(str);
    }
}

class User {
    private int id;
    private String fio;
    private String phone;

    public User() {
    }

    public User(int id, String name, String phone) {
        this.id = id;
        this.fio = name;
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
