package jpa_and_hibernate.jpa.com.tutorialspoint.jpql;

import jpa_and_hibernate.jpa.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Ordering {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //Between
        Query query = entityManager.createQuery("select e from Employee1 e" + "" +
                " order by e.name asc");

        List<Employee> list = query.getResultList();
        for (Employee e : list) {
            System.out.println("Employee1 ID : " + e.getEid());
            System.out.println("\t Employee1 name : " + e.getName());
        }
    }
}
