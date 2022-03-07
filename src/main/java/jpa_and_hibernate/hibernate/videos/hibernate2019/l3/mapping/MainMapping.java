package jpa_and_hibernate.hibernate.videos.hibernate2019.l3.mapping;

import jpa_and_hibernate.hibernate.videos.hibernate2019.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainMapping {
    public static void main(String[] args) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try (SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        ) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(new Student("Max"));
            session.getTransaction().commit();
        }
    }
}
