package book.ocp.chapter2.page67;

public class Animal {
    private String species;
    private int age;

    public Animal(String species){
        this.species = species;
    }

    public String getSpecies(){
        return species;
    }

    public void getSpecies(String species){
        if (species == null || species.trim().length()==0){
            throw new IllegalArgumentException("Species is required");
        }
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            throw new IllegalArgumentException("Age cannot be a negative number");
        }
        this.age = age;
    }
}
