package jpa_and_hibernate.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindEmployee {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Employee employee = entityManager.find(Employee.class,1201);

            System.out.println("employee ID = " + employee.getEid( ));
            System.out.println("employee NAME = " + employee.getName( ));
            System.out.println("employee SALARY = " + employee.getSalary( ));
            System.out.println("employee DESIGNATION = " + employee.getDeg( ));

            entityManager.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
