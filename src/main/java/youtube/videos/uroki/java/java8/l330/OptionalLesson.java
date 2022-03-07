package youtube.videos.uroki.java.java8.l330;

import java.util.Optional;

public class OptionalLesson {
    public static void main(String[] args) {

//        boolean s = Stream.of("12","33").min(String::indexOf).isPresent();
//        System.out.println(s);


        Optional<String> optionalS = getO();
        if(optionalS.isPresent())
        {
            System.out.println(optionalS.get());
        }
    }

    static Optional<String> getO(){
        if (false) {
            return Optional.of("Hello");
        } else {
            System.out.println("ara de nulla eli, hazar asinq ches kara");
        }
        return Optional.empty();
    }
}
