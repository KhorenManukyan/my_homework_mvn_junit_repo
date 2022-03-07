package jpa_and_hibernate.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Hibernate_JPA");

        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        try {
            Book book = new Book("OCP","Oracle",600, LocalDate.now());
            entitymanager.persist(book);
            entitymanager.getTransaction().commit();
        } catch (Exception e) {
            entitymanager.getTransaction().rollback();
        }

        entitymanager.close();
        emfactory.close();
    }
}
