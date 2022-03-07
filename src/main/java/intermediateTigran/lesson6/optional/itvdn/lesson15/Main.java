package intermediateTigran.lesson6.optional.itvdn.lesson15;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> optional1 = Optional.empty();
        Optional<Integer> optional2 = Optional.of(10);
        Optional<Integer> optional3 = Optional.ofNullable(null);

        String str;

        if (getString().isPresent()) {
            str = getString().orElseGet(String::new);
            System.out.println(str);
        }

//        System.out.println(optional1);
//        System.out.println(optional2);
//        System.out.println(optional3);
    }

    public static Optional<String> getString() {
        if (true) {
            return Optional.of("Simple value");
        }
        return Optional.empty();
    }
}
