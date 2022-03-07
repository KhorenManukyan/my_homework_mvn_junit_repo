package youtube.videos.uroki.java.regex.lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("<[A-Za-z][A-Za-z0-9]*");
        Matcher m = p.matcher("<h1898>");
        while (m.find()){
            System.out.println(m.group() + " ");
        }
    }
}
