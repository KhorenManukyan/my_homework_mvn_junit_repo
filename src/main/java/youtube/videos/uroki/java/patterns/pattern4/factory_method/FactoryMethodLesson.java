package youtube.videos.uroki.java.patterns.pattern4.factory_method;

public class FactoryMethodLesson {
    public static void main(String[] args) {
        Person person = Person.create();
    }
}

class Person{
    private Person(){}
    public static Person create(){
        return new Person();
    }
}
