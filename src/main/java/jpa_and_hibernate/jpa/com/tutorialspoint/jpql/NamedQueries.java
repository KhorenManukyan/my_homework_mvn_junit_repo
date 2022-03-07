package jpa_and_hibernate.jpa.com.tutorialspoint.jpql;

import jpa_and_hibernate.jpa.com.tutorialspoint.entity.Employee2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class NamedQueries {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("find employee by id");

        query.setParameter("id", 1204);
        List<Employee2> list = query.getResultList();
        for (Employee2 e:list){
            System.out.println("Employee1 ID : " + e.getId());
            System.out.println("\t Employee1 name : " + e.getName());
        }
    }
}
