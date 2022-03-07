package itvdn.java.proffessional.lesson4.mod4.test.animals;

import itvdn.java.proffessional.lesson4.mod4.Animal;
import itvdn.java.proffessional.lesson4.mod4.Cat;
import itvdn.java.proffessional.lesson4.mod4.Fish;
import itvdn.java.proffessional.lesson4.mod4.Spider;

public class TestAnimals {
    static Animal myCat = new Cat("Tiger!");
    static Animal mySpider = new Spider();
    static Animal myFish = new Fish();

    public static void main(String[] args) {
        ((Cat)myCat).setName("Toyger");
        System.out.println(((Cat) myCat).getName());
        myCat.walk();
        ((Cat) myCat).play();
        myCat.eat();

        System.out.println();

        mySpider.walk();
        mySpider.eat();

        System.out.println();
        ((Fish)myFish).setName("My Fish");
        System.out.println(((Fish) myFish).getName());
        myFish.walk();
        myFish.eat();
        ((Fish) myFish).play();
    }
}
