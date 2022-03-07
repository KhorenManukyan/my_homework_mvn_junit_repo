package book.horstman1.page296_297_298;

/**
 * This program demonstrates inheritance.
 *
 * @author Khoren
 * @version 11 2021-10-19
 */
public class ManagerTest {
    public static void main(String[] args) {
        //construct a Manger object
        var boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        var staff = new Employee[3];
        //fill the staff array with Manger and Employee objects

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        //print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
        }
    }
}