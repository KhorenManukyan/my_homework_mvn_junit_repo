package youtube.videos.uroki.java.regex.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("\\d+");
//        Pattern p = Pattern.compile("^\\d*$");
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher("");
        if (m.find()){
            System.out.println("It's a number");
        } else {
            System.out.println("not");
        }
    }
}
