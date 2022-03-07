package intermediateTigran.lesson6.stream.itvdn.ex001stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Sergei", 30));
        persons.add(new Person("Andrei", 14));
        persons.add(new Person("Alexander", 28));
        persons.add(new Person("Anna", 8));
        persons.add(new Person("Evgenii", 25));

        persons.stream()
                .filter(p->p.getAge()>=18)
                .sorted(Comparator.comparing(Person::getName))
                .map(Person::getName)
                .forEach(System.out::println);
    }
}




















