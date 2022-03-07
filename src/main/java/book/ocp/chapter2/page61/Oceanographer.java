package book.ocp.chapter2.page61;

interface LivesInOcean {
    public void makeSound();
}

class Dolphin implements LivesInOcean {
    @Override
    public void makeSound() {
        System.out.println("whistle");
    }
}

class Whale implements LivesInOcean {
    @Override
    public void makeSound() {
        System.out.println("sing");
    }
}

public class Oceanographer {
    public static void main(String[] args) {
        Oceanographer oceanographer = new Oceanographer();
        oceanographer.checkSound(new Dolphin());
        oceanographer.checkSound(new Whale());
    }

    public void checkSound(LivesInOcean livesInOcean) {
        livesInOcean.makeSound();
    }
}
