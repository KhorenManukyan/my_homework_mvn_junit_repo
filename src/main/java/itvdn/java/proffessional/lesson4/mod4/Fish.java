package itvdn.java.proffessional.lesson4.mod4;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
        name = "Goldy";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish don't play!");
    }
    public void walk(){
        System.out.println("Fish don't walk, she's swim all the day!");
    }

    @Override
    public void eat() {
        System.out.println("Fish eats meals!");
    }
}
