package youtube.videos.uroki.java.regex.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("^a");
//        Pattern p = Pattern.compile("^b");
//        Pattern p = Pattern.compile("c$");
        Pattern p = Pattern.compile("f$");
        Matcher m = p.matcher("abcdef");
        while (m.find()){
            System.out.print(m.start() + " " + m.group() + " ");
        }
    }
}
