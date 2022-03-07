package youtube.videos.uroki.java.regex.lesson2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("cat");
        Matcher m = p.matcher("He captured a catfish for his Cat. And take his dog and cat to rest");
        while (m.find()){
            System.out.print(m.start() + " " +  m.group()+ " ");
        }
    }
}
