package jpa_and_hibernate.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteEmployee {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Employee employee = entityManager.find(Employee.class, 1201);
            Employee employee1 = entityManager.find(Employee.class, 1202);
            Employee employee2 = entityManager.find(Employee.class, 1203);
            Employee employee3 = entityManager.find(Employee.class, 1204);
            Employee employee4 = entityManager.find(Employee.class, 1205);
            Employee employee5 = entityManager.find(Employee.class, 1206);
            entityManager.remove(employee);
            entityManager.remove(employee1);
            entityManager.remove(employee2);
            entityManager.remove(employee3);
            entityManager.remove(employee4);
            entityManager.remove(employee5);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}
