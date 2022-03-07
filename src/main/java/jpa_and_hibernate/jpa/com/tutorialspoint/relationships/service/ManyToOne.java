package jpa_and_hibernate.jpa.com.tutorialspoint.relationships.service;

import jpa_and_hibernate.jpa.com.tutorialspoint.relationships.manyToOne.Department;
import jpa_and_hibernate.jpa.com.tutorialspoint.relationships.manyToOne.Employee1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOne {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        //create Department1 Entity
        Department department = new Department();
        department.setName("Development");

        //Store Department1
        entityManager.persist(department);

        //create Employee1 Entity
        Employee1 employee1 = new Employee1();
        employee1.setName("Satish");
        employee1.setSalary(45000.0);
        employee1.setDeg("Technical Writer");
        employee1.setDepartment(department);

        //Create Employee2 Entity
        Employee1 employee12 = new Employee1();
        employee12.setName("Krishna");
        employee12.setSalary(45000.0);
        employee12.setDeg("Technical Writer");
        employee12.setDepartment(department);

        //Create Employee3 Entity
        Employee1 employee13 = new Employee1();
        employee13.setName("Masthanvali");
        employee13.setSalary(50000.0);
        employee13.setDeg("Technical Writer");
        employee13.setDepartment(department);

        //Store Employees
        entityManager.persist(employee1);
        entityManager.persist(employee12);
        entityManager.persist(employee13);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}























