package youtube.videos.uroki.java.java8.l333;

import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2021,5,3);
        DateTimeFormatter dateFormatProvider = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.format(dateFormatProvider));
    }
}
