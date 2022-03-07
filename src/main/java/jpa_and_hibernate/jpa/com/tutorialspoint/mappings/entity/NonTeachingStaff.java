package jpa_and_hibernate.jpa.com.tutorialspoint.mappings.entity;

public class NonTeachingStaff extends Staff {
    private String areaExpertise;

    public NonTeachingStaff(int id, String name, String areaExpertise) {
        super(id, name);
        this.areaExpertise = areaExpertise;
    }

    public NonTeachingStaff() {
    }

    public String getAreaExpertise() {
        return areaExpertise;
    }

    public void setAreaExpertise(String areaExpertise) {
        this.areaExpertise = areaExpertise;
    }
}
