package jpa_and_hibernate.jpa.com.tutorialspoint.jpql;

import jpa_and_hibernate.jpa.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class BetweenAndLikeFunctions {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //Between
        Query query = entityManager.createQuery("select empl from  Employee1 empl" +
                " where empl.salary between 30000 and 40000");
        List<Employee> list = query.getResultList();

        for (Employee e: list){
            System.out.println("Employee1 ID : " + e.getEid());
            System.out.println("\t Employee1 salary : " + e.getSalary());
        }

        //Like
        System.out.println();
        Query query1 = entityManager.createQuery("select e from Employee1 e" +
                " where e.name like 'M%'");

        List <Employee> list1 =(List<Employee>) query1.getResultList();

        for (Employee e: list1){
            System.out.println("Employee1 ID : " + e.getEid());
            System.out.println("\t Employee1 name : " + e.getName());
        }
    }
}
