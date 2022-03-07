package youtube.videos.uroki.java.regex.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("Nov(ember)?");
        Matcher m = p.matcher("November Nov November Novembe");
        while (m.find()){
            System.out.print(m.group() + " ");
        }
    }
}
