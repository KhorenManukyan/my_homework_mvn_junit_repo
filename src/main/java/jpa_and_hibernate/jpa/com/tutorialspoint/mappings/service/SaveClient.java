package jpa_and_hibernate.jpa.com.tutorialspoint.mappings.service;

import jpa_and_hibernate.jpa.com.tutorialspoint.mappings.entity.NonTeachingStaff;
import jpa_and_hibernate.jpa.com.tutorialspoint.mappings.entity.TeachingStaff;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveClient {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        //Teaching staff entity
        TeachingStaff teachingStaff1 = new TeachingStaff(1,"Gopal","MSc MEd","Maths");
        TeachingStaff teachingStaff2=new TeachingStaff(2, "Manisha", "BSc BEd", "English");

        //Non-Teaching Staff entity
        NonTeachingStaff nonTeachingStaff1=new NonTeachingStaff(3, "Satish", "Accounts");
        NonTeachingStaff nonTeachingStaff2=new NonTeachingStaff(4, "Krishna", "Office Admin");

        //storing all entities
        entityManager.persist(teachingStaff1);
        entityManager.persist(teachingStaff2);
        entityManager.persist(nonTeachingStaff1);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
