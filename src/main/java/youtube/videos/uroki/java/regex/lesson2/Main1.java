package youtube.videos.uroki.java.regex.lesson2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("1 \\+ 1 = 2");
        Pattern p = Pattern.compile("\\Q1 + 1 = 2\\E");
        Matcher m = p.matcher("1 + 1 = 2");
        while (m.find()){
            System.out.print(m.start() + " " +  m.group()+ " ");
        }
    }
}
