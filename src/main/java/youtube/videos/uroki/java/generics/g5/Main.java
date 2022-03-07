package youtube.videos.uroki.java.generics.g5;

public class Main {

    static void add(Cell cell){
//        cell.getT("hello");
    }
    public static void main(String[] args) {
        Cell<House> cell = new Cell<>();
        add(cell);
        House house = cell.getT();
    }
}

class House{}

class Cell<T>{
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
