package youtube.videos.uroki.java.all_other.lesson170;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("test.txt").toAbsolutePath();
//        System.out.println(path.getFileName());
//        System.out.println(path.getParent());
//        System.out.println(path.getRoot());
//        System.out.println(path.isAbsolute());

        Files.copy(Paths.get("test.txt"), Paths.get("temp2.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.copy(Paths.get("temp2.txt"), Paths.get("temp3.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.deleteIfExists(Paths.get("temp3.txt"));
        Files.deleteIfExists(Paths.get("temp2.txt"));
    }
}
