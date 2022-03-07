package json.jaxb.and.xml.json.json.json.example1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonSimpleParser {

    private static final String TAG_NAME_MAIN = "name";
    private static final String TAG_PEOPLE = "people";
    private static final String TAG_NAME = "name";
    private static final String TAG_AGE = "age";

    public Root parse() {
        Root root = new Root();
        JSONParser jsonParser = new JSONParser();
        try (FileReader fileReader = new FileReader("C:\\apps\\IdeaProjects\\my_mvn_junit_repo\\src\\main\\java\\json\\and\\xml\\java\\json\\json\\example1\\test.json")) {
            JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);

            String name = (String) jsonObject.get(TAG_NAME_MAIN);

            JSONArray jsonArray = (JSONArray) jsonObject.get(TAG_PEOPLE);

            List<People> peopleList = new ArrayList<>();
            for (Object it : jsonArray) {
                JSONObject peopleJsonObject = (JSONObject) it;

                String namePeople = (String) peopleJsonObject.get(TAG_NAME);
                long agePeople = (long) peopleJsonObject.get(TAG_AGE);

                People people = new People(namePeople, (int) agePeople);
                peopleList.add(people);
            }
            root.setName(name);
            root.setPeople(peopleList);

            return root;
        } catch (Exception e) {
            System.out.println("Parsing error " + e.toString());
        }


        return null;
    }
}
