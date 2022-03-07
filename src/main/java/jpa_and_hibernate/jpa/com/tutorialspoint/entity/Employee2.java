package jpa_and_hibernate.jpa.com.tutorialspoint.entity;

//import jakarta.persistence.*;
import javax.persistence.*;


@Entity
@Table
public class Employee2 {
    @Id
    private int id;
    private String name;
    private double salary;
    private String deg;

    public Employee2(int id, String name, double salary, String deg) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deg = deg;
    }

    public Employee2() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", deg='" + deg + '\'' +
                '}';
    }
}
