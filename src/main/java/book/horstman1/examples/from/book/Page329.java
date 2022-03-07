package book.horstman1.examples.from.book;

public class Page329 {
    public static void main(String[] args) {
        var s = "Ok";
        var sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());
        var t = new String("Ok");
        var tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());
    }
}
