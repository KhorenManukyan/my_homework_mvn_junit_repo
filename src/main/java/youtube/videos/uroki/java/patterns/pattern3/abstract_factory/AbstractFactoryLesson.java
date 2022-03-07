package youtube.videos.uroki.java.patterns.pattern3.abstract_factory;

interface Tank {
    void drive();
}

interface Car {
    void drive();
}

interface Factory {
    Car createCar(String typeOfCar);

    Tank createTank(String typeOfTank);
}

class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Toyota drive!!!");
    }
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Audi drive!!!");
    }
}

class CarFactory implements Factory {
    public Car createCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota":
                return new Toyota();
            case "Audi":
                return new Audi();
            default:
                return null;

        }
    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}

public class AbstractFactoryLesson {
    public static void main(String[] args) {
        Factory carFactory = new AbstractFactory().createFactory("Cat");
        Factory tankFactory = new AbstractFactory().createFactory("Tank");
        Car toyota = carFactory.createCar("Toyota");
        Car audi = carFactory.createCar("Audi");
        toyota.drive();
        audi.drive();
        Tank t51 = tankFactory.createTank("T51");
        Tank t52 = tankFactory.createTank("T52");
        t51.drive();
        t52.drive();
    }
}

class T51 implements Tank {
    @Override
    public void drive() {
        System.out.println("T51 drive!!!");
    }
}

class T52 implements Tank {
    @Override
    public void drive() {
        System.out.println("T52 drive!!!");
    }
}

class TankFactory implements Factory {
    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }

    public Tank createTank(String typeOfTank) {
        switch (typeOfTank) {
            case "T51":
                return new T51();
            case "T52":
                return new T52();
            default:
                return null;

        }
    }
}

class AbstractFactory {
    public Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "Cat":
                return new CarFactory();
            case "Tank":
                return new TankFactory();
            default:
                return null;
        }
    }
}
