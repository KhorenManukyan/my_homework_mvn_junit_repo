package youtube.videos.uroki.java.all_other.lesson169;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
/*//        Reader reader = new FileReader("test.txt");
        BufferedReader reader = new BufferedReader(new  FileReader("test.txt"));
//        int i = 0;
//        while ((i = reader.read()) != -1){
//            System.out.print((char) i);
//        }

*//*        char[] chars = new char[50];
        while (reader.read(chars) != -1){
            System.out.println(chars);
        }*//*

*//*        char[] chars = new char[50];
        while (reader.read(chars) != -1) {
            for (int i = 0; i < chars.length; i++) {
                if (Character.isAlphabetic(chars[i]) || Character.isWhitespace(chars[i])) {
                    System.out.print(chars[i]);
                }
            }
        }*//*

        while (reader.read() != -1){
            System.out.println(reader.readLine());
        }*/
        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
        writer.write("aaa");
        writer.newLine();
        writer.write("bbb\n");
        writer.write("str   111");

        writer.close();

        InputStream inputStream;
        OutputStream outputStream;
    }
}
