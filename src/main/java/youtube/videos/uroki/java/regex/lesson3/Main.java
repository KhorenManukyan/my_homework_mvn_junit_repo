package youtube.videos.uroki.java.regex.lesson3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[0-8a-z%#A-F&]");
        Matcher m = p.matcher("13A5%8sdFG#fk%djs&");
        while (m.find()) {
            System.out.print(/*m.start() + " " +*/ m.group() + " ");
        }
        System.out.println("");
    }
}
