package youtube.videos.uroki.java.all_other.lesson166;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourceLesson {
    static class MyLaptop implements AutoCloseable{
        @Override
        public void close() throws Exception {

        }
    }
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("some file name");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (MyLaptop myLaptop = new MyLaptop();
             Reader reader1 = new FileReader("file2")){

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
