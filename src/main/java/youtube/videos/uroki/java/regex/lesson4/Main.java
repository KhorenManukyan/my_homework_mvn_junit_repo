package youtube.videos.uroki.java.regex.lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //mm/dd/yy
        Pattern p = Pattern.compile("\\d\\d[/.-]\\d\\d[/.-]\\d\\d");
        Matcher m = p.matcher("22-10-21");
        while (m.find()){
            System.out.print(/*m.start() + " " +*/ m.group() + " ");
        }
    }
}
