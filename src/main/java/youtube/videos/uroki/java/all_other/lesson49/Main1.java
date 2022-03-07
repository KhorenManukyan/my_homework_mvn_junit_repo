package youtube.videos.uroki.java.all_other.lesson49;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Book{
    String author;
    String name;
}

class Ticket{
    int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return number == ticket.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}


public class Main1 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.number = 123;
        Book book = new Book();
        book.author = " Karnegy";
        book.name = "How to get friends";
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket, book);


//        Book karnegiBook = library.get(ticket);
//        System.out.println(karnegiBook.author);

        Ticket ticket1 = new Ticket();
        ticket1.number = 123;

        Book karnegiBook = library.get(ticket1);
        System.out.println(karnegiBook.author);

//        System.out.println(book.hashCode());

    }
}
