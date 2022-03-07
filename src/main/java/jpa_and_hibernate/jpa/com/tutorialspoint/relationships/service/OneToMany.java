package jpa_and_hibernate.jpa.com.tutorialspoint.relationships.service;

import jpa_and_hibernate.jpa.com.tutorialspoint.relationships.oneToMany.Department1;
import jpa_and_hibernate.jpa.com.tutorialspoint.relationships.oneToMany.Employee3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class OneToMany {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        //Create Employee1 Entity
        Employee3 employee1 = new Employee3();
        employee1.setName("Satish");
        employee1.setSalary(45000.0);
        employee1.setDeg("Technical Writer");

        //Create Employee2 Entity
        Employee3 employee2 = new Employee3();
        employee2.setName("Krishna");
        employee2.setSalary(45000.0);
        employee2.setDeg("Technical Writer");

        //Create Employee3 Entity
        Employee3 employee3 = new Employee3();
        employee3.setName("Masthanvali");
        employee3.setSalary(50000.0);
        employee3.setDeg("Technical Writer");

        //Store Employee3
        entityManager.persist(employee1);
        entityManager.persist(employee2);
        entityManager.persist(employee3);

        //create employeeList
        List<Employee3> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        //crete Department1 Entity
        Department1 department = new Department1();
        department.setName("Development");
        department.setEmployeeList(employeeList);

        //store Department1
        entityManager.persist(department);

        entityManager.getTransaction().commit();

        entityManagerFactory.close();
        entityManager.close();

    }
}
