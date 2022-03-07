package intermediateTigran.lesson6.stream.itvdn.ex002stream_average;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Sergei", 30));
        persons.add(new Person("Andrei", 14));
        persons.add(new Person("Alexander", 25));
        persons.add(new Person("Anna", 8));
        persons.add(new Person("Evgenii", 23));

        int sum = 0;
        int adultPersons = 0;
        for (Person p : persons) {
            if (p.getAge() >= 18) {
                sum += p.getAge();
                adultPersons++;
            }
        }

        double averageAge = (double) sum / adultPersons;
        System.out.println(averageAge);

        double average2 = persons.stream()
                .filter(person -> person.getAge() >= 18)
                .mapToInt(p -> p.getAge())
                .average().getAsDouble();

        System.out.println(average2);

        persons.stream().map(p -> p.getAge()).forEach(System.out::println);
    }
}




















