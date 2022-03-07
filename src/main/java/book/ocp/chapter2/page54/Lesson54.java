package book.ocp.chapter2.page54;

@FunctionalInterface
interface Sprint {
    public void sprint(Animal animal);
}

interface Run extends Sprint {
}

interface SprintFaster extends Sprint {
    @Override
    public void sprint(Animal animal);
}

interface Skip extends Sprint {
    public static void skip(int speed) {
    }

    public default int getHopCount(Kangaroo kangaroo) {
        return 10;
    }
}


public class Lesson54 {
    public static void main(String[] args) {
        Skip skip = new Animal();
        System.out.println(skip.getHopCount(new Kangaroo()));
//        skip.sprint(new Animal());
    }
}
