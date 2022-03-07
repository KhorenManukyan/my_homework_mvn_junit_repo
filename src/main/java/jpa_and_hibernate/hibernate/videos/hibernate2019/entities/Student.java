package jpa_and_hibernate.hibernate.videos.hibernate2019.entities;


//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;

//import javax.persistence.*;

public class Student {
    int id;
    String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
