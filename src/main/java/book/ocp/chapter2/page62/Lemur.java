package book.ocp.chapter2.page62;

interface HasTail {
    public boolean isTailStriped();
}

class Primate {
    public boolean hasHair() {
        return true;
    }
}

public class Lemur extends Primate implements HasTail {
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
//        System.out.println(hasTail.age);
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
//        System.out.println(primate.isTailStriped());
        System.out.println(primate.hasHair());
    }

    public boolean isTailStriped() {
        return false;
    }
}
