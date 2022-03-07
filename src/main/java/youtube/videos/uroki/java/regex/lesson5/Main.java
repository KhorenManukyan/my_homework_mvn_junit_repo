package youtube.videos.uroki.java.regex.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\bis\\b");
        Matcher m = p.matcher("This is island is beautiful is");
        while (m.find()) {
            System.out.print(/*m.start() + " " +*/ m.group() + " ");
        }

    }
}
