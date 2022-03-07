package youtube.videos.uroki.java.all_other.lesson58;

class Popcorn{
    void doSomething(){
        System.out.println("Popcorn");
    }
}

public class Main {
    public static void main(String[] args) {
        Popcorn popcorn = new Popcorn(){
          void doSomething(){
              System.out.println("main");
          }
        };
        popcorn.doSomething();
        Popcorn popcorn2 = new Popcorn();
        popcorn2.doSomething();
    }
}
