package jpa_and_hibernate.jpa.com.tutorialspoint.relationships.manyToOne;

import javax.persistence.*;

@Entity
public class Employee1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double salary;
    private String deg;

    @ManyToOne
    private Department department;

    public Employee1(int id, String name, double salary, String deg) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deg = deg;
    }

    public Employee1() {
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
