package youtube.videos.uroki.java.patterns.pattern5.singleton;

public class SingletonLesson {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton.i = 5;
        singleton2.i = 8;
        singleton.i = 44;
        System.out.println(singleton.i);
        System.out.println(singleton2.i);
    }
}

class Singleton {
    static Singleton singleton = new Singleton();
    int i = 0;

    private Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }
}