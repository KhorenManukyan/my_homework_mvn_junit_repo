package book.ocp.chapter2.page55;

public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean isCanHop(){
        return canHop;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", canHop=" + canHop +
                ", canSwim=" + canSwim +
                '}';
    }
}
