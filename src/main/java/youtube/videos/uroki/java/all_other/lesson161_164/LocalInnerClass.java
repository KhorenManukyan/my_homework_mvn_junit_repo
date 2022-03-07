package youtube.videos.uroki.java.all_other.lesson161_164;

public class LocalInnerClass {
    static int i = 5;
    int j = 6;

    void does(int e){
        int k = 8;
        class Local{
            private final static int w = 3;
            public int q = j;
            int t = e;
            int y = k;
        }
        Local local = new Local();
    }
    public static void main(String[] args) {
        LocalInnerClass l = new LocalInnerClass();
        l.does(8);
    }
}
