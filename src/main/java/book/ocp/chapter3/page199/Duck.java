package book.ocp.chapter3.page199;

public class Duck implements Comparable{
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        Duck duck = (Duck) o;
        return name.compareTo(duck.name);
    }

}
