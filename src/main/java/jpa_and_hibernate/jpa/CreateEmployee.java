package jpa_and_hibernate.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateEmployee {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        try {
            Employee employee = new Employee();
            employee.setEid(1201);
            employee.setName("Dopal");
            employee.setSalary(40000);
            employee.setDeg("Technical Manager");
            entityManager.persist(employee);
            Employee employee1 = new Employee(1202,"Manisha",40000,"Proof Reader");
            Employee employee2 = new Employee(1203,"Masthanvali",40000,"Technical Writer");
            Employee employee3 = new Employee(1204,"Satish",30000,"Technical Writer");
            Employee employee4 = new Employee(1205,"Krishna",30000,"Technical Writer");
            Employee employee5 = new Employee(1206,"Kiran",35000,"Proof Reader");
            entityManager.persist(employee1);
            entityManager.persist(employee2);
            entityManager.persist(employee3);
            entityManager.persist(employee4);
            entityManager.persist(employee5);
//            System.out.println(employee.toString());
            System.out.println(employee);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }


        entityManager.close();
        entityManagerFactory.close();
    }
}
