package jpa_and_hibernate.jpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateEmployee {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Employee employee = entityManager.find(Employee.class,1201);

            // before update
            System.out.println(employee);
            employee.setSalary(46000);
            entityManager.getTransaction().commit();

            //after update
            System.out.println(employee);
            entityManager.close();
            entityManagerFactory.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
