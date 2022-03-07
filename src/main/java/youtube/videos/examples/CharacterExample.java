package youtube.videos.examples;

import java.util.regex.Pattern;

public class CharacterExample {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[xyz]","whcd"));
        System.out.println(Pattern.matches("[xyz]","z"));
        System.out.println(Pattern.matches("[xyz]","xxyyyyz"));
    }
}
