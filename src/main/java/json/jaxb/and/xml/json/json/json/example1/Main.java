package json.jaxb.and.xml.json.json.json.example1;

public class Main {
    public static void main(String[] args) {
        JsonSimpleParser parser = new JsonSimpleParser();
        Root root = parser.parse();
        System.out.println("Root " + root.toString());
    }
}
