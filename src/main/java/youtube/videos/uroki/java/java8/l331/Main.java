package youtube.videos.uroki.java.java8.l331;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(new Student("Aram"), new Student("Khoren"), new Student("aaa")).map(Student::getName).forEach(System.out::println);
        Stream.of("John", "Andy").map(Student::new).forEach(x -> System.out.println(x.getName()));
    }
}

class Student{
    String name;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}