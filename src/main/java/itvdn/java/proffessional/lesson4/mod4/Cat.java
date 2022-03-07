package itvdn.java.proffessional.lesson4.mod4;

public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        super(4);
        this.name = "Fluffy";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("Cat play with mouse!");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats mice!");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
