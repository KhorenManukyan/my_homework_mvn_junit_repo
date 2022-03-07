package youtube.videos.uroki.java.regex.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("Feb(ruary)? 23(rd)?");
        Matcher m = p.matcher("February 23rd, February 23, Feb 23rd, Feb 23");
        while (m.find()){
            System.out.print(m.group() + " ");
        }
        System.out.println("");
    }
}
