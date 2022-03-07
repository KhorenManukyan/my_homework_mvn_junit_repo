package jpa_and_hibernate.jpa.com.tutorialspoint.mappings.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class Staff implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private int id;
    private String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Staff() {
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
