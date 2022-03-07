package itvdn.java.proffessional.lesson8.mod8;

import java.io.*;
import java.util.Date;

public class UnSerializeDate {
    UnSerializeDate(){
        Date d = null;
        try {
            FileInputStream f = new FileInputStream("date.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            d = (Date) s.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Unserialized Date object from \"date.ser\"");
        System.out.println("Date: " + d);
    }

    public static void main(String[] args) {
        new UnSerializeDate();
    }
}
