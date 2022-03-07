package youtube.videos.uroki.java.generics.g1;

public class Main {
    public static void main(String[] args) {
/*        Cell<String> cell = new Cell<>("abo");
        cell.setT("luso");
        String  s = cell.getT();
        System.out.println(s);*/

        Cell cell = new Cell("abo");
        cell.setObject("luso");
        String  s = (String) cell.getObject();
        System.out.println(s);
    }
}
/*
class Cell<T>{
    T t;

    Cell(T t){
        this.t = t;
    }

    public T getT(){
        return t;
    }

    public void setT(T t){
        this.t = t;
    }
}*/

class Cell{
    Object object;

    Cell(Object o){
        object = o;
    }

    public Object getObject(){
        return object;
    }

    public void setObject(Object o){
        object = o;
    }
}
