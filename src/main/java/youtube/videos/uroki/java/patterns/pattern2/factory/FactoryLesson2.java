package youtube.videos.uroki.java.patterns.pattern2.factory;

interface Bottle {
    void mark();
}

public class FactoryLesson2 {
    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();
        factory1.bottle("cola").mark();
        factory1.bottle("fanta").mark();
        factory1.bottle("sprite").mark();
        Bottle cola = factory1.bottle("fanta");
        cola.mark();
    }
}

class Cola implements Bottle {
    @Override
    public void mark() {
        System.out.println("The bottle of cola");
    }
}

class Fanta implements Bottle {
    @Override
    public void mark() {
        System.out.println("The bottle of fanta");
    }
}

class Sprite implements Bottle {
    @Override
    public void mark() {
        System.out.println("The bottle of sprite");
    }
}

class Factory1 {
    public Bottle bottle(String typeOfBottle) {
        switch (typeOfBottle) {
            case "sprite":
                return new Sprite();
            case "cola":
                return new Cola();
            case "fanta":
                return new Fanta();
            default:
                return null;
        }
    }
}
