package youtube.videos.uroki.java.all_other.lesson60;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        SomeClass someClass = new SomeClass();
        Class clss = someClass.getClass();
        Class clss2 = SomeClass.class;
        Class clss3 = Class.forName("youtube.videos.uroki.java.all_other.lesson60.SomeClass");
        SomeClass someClass1 = (SomeClass)clss.newInstance();

        Constructor[] constructors = clss.getDeclaredConstructors();
        for (Constructor constructor: constructors){
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter: parameters){
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
        }

    }
}

class SomeClass {
    private static transient int i;
    String s;

    public SomeClass() {
    }

    public SomeClass(String s) {
        this.s = s;
    }

    public String someMethod() {
        System.out.println("this si " + s);
        return s;
    }
}
