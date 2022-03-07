package jpa_and_hibernate.jpa;

import javax.persistence.*;

@Entity
@Table
public class Employee {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private int eid;
    @Column
    private String name;
    @Column
    private double salary;
    @Column
    private String deg;

    public Employee( int eid, String name, double salary, String deg) {
        super();
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        this.deg = deg;
    }

    public Employee() {
        super();
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
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
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", deg='" + deg + '\'' +
                '}';
    }
}
