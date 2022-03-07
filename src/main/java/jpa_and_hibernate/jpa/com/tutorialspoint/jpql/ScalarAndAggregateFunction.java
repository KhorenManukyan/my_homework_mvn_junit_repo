package jpa_and_hibernate.jpa.com.tutorialspoint.jpql;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ScalarAndAggregateFunction {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        //Scalar function
        Query query = entityManager.
                createQuery("SELECT UPPER(e.name) from Employee1 e");
        List<String> list = query.getResultList();

        for (String e : list) {
            System.out.println("Employee1 Name : " + e);
        }

        //Aggregate function
        Query query1 = entityManager.
                createQuery("select max(emp.salary) from Employee1 emp");
        Double result = (Double) query1.getSingleResult();
        System.out.println("Max Employee1 Salary : " + result);
    }
}
