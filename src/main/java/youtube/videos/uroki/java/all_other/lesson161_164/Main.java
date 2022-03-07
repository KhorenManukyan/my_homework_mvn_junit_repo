package youtube.videos.uroki.java.all_other.lesson161_164;

public class Main {
    public static void main(String[] args) {
        StaticInnerClass.Inner staticInnerClass = new StaticInnerClass.Inner();
        System.out.println(staticInnerClass.getInstance());
        StaticInnerClass staticInnerClass1 = new StaticInnerClass();
        System.out.println(staticInnerClass1.getA());
    }
}

class StaticInnerClass{
    private static int a = 4;
    int getA(){
        return a=3;
    }

    static class Inner{
        public static int getInstance() {
            return a=2;
        }
    }
}
