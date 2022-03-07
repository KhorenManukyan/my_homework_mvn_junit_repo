package youtube.videos.uroki.java.all_other.lesson45;

import java.io.*;

public class Main1 {
    public static void main(String[] args) throws Exception {
        File file = new File("test.txt");
        if (!file.exists()){
            file.createNewFile();
//            System.out.println("ex");
        }

/*        if (file.isFile()){
            System.out.println("file");
        }

        if (file.isDirectory()){
            System.out.println("dir");
        }
    */


        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("str1\n");
        fileWriter.write("str2\n");
        fileWriter.flush();
//        fileWriter.close();

        FileReader fileReader = new FileReader(file);
//        char[] chars = new char[20];
//        fileReader.read(chars);
//        System.out.println(chars);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("str3");
        bufferedWriter.newLine();
        bufferedWriter.write("str4");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
    }
}
