package youtube.videos.uroki.java.regex.lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\".*?\"");
//        Matcher m = p.matcher("Put a \"string\" between double quotes!");
        Matcher m = p.matcher("Hauston, we have a problem with \"string one\" and \"string two\". Please respond!");
        while (m.find()) {
            System.out.print(/*m.start() + " " +*/ m.group() + " ");
        }
    }
}
