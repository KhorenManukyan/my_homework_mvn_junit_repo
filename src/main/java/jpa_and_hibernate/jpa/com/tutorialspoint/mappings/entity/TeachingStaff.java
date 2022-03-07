package jpa_and_hibernate.jpa.com.tutorialspoint.mappings.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "TS")
public class TeachingStaff extends Staff{
    private String qualification;
    private String subjectExpertise;

    public TeachingStaff(int id, String name, String qualification, String subjectExpertise) {
        super(id, name);
        this.qualification = qualification;
        this.subjectExpertise = subjectExpertise;
    }

    public TeachingStaff() {
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSubjectExpertise() {
        return subjectExpertise;
    }

    public void setSubjectExpertise(String subjectExpertise) {
        this.subjectExpertise = subjectExpertise;
    }
}
