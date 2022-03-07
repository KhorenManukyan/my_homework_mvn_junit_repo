package youtube.videos.uroki.java.all_other.lesson45;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("temp");
//
//        if (!file.exists()){
//            file.createNewFile();
//            System.out.println("exists!!!");
//        }
        if (file.isDirectory()){
            System.out.println("dir");
        }

        if (file.isFile()){
            System.out.println("file");
        }


    }
}
