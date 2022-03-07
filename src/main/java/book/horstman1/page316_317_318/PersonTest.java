package book.horstman1.page316_317_318;

public class PersonTest {
    public static void main(String[] args) {
        var people = new Person[2];

        // fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 21);
        people[1] = new Student("Maria Moris", "computer science");

        for (Person p: people){
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
