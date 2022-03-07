package youtube.videos.uroki.java.all_other.lesson161_164;

public class InnerClassLesson {
    private  static int i = 3;
    private int j = 5;

    class Inner{
        int q = i;
        int k = j;

        void method(){
            q = i + j;
            System.out.println(q);
        }
    }
//    public static void main(String[] args) {
//        Inner inner = new InnerClassLesson().new Inner();
//        inner.method();
//    }
}
class OtherClass{
    public static void main(String[] args) {

        InnerClassLesson.Inner inner = new InnerClassLesson().new Inner();
        inner.method();
    }
}
