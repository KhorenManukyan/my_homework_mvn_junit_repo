package book.ocp.chapter4.page226;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        Supplier<StringBuilder> stringBuilderSupplier1 = StringBuilder::new;
        Supplier<StringBuilder> stringBuilderSupplier2 = () -> new StringBuilder();
        System.out.println(s1.get());
        System.out.println(s2.get());

        Supplier<ArrayList<String>> arrayListSupplier = ArrayList<String>::new;
        ArrayList<String> arrayList5 = arrayListSupplier.get();
        System.out.println(arrayList5);
    }

}
