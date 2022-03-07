package youtube.videos.uroki.java.generics.g2;

public class Main {
    public static void main(String[] args) {

    }
}

class Parent{}

class GenParent<T> extends Parent{}
class Child extends GenParent{}
class Child2 extends GenParent<String>{}
class Child3<T> extends GenParent<T>{}
class Child4<X, T, Y> extends GenParent<Y>{}
class Child5<X, T, Y> extends GenParent{}
class Child6<X, T, Y> extends Child5<Integer, Integer , String> {}

interface GenericInterface<T>{
    T getT();
}

class One implements GenericInterface<Integer>{
    @Override
    public Integer getT() {
        return null;
    }
}

