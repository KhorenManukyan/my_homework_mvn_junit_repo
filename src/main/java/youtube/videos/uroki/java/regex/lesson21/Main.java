package youtube.videos.uroki.java.regex.lesson21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("\\d+");
//        Matcher m = p.matcher("a12c3e456f");
//        while (m.find()){
//            System.out.print(m.start() + " " + m.group() + " ");


//            Pattern p = Pattern.compile("\\w");
//        Matcher m = p.matcher("a12Zc3eF456f");
//        while (m.find()){
//            System.out.print(m.start() + " " + m.group() + " ");


            Pattern p = Pattern.compile("[a-c]");
        Matcher m = p.matcher("abc");
        while (m.find()){
            System.out.print(m.start() + " " + m.group() + " ");        }
    }
}
