package youtube.videos.uroki.java.patterns.pattern32.dao;

interface Data {
    String getData();
}

public class DAOPatternLesson {

    static Db db = new Db();
    static FileSystem fileSystem = new FileSystem();

    public static void main(String[] args) {
        Data data = new Db();
        System.out.println(data.getData());
        System.out.println(db.getFromTable());
        System.out.println(fileSystem.getDataFromFs());
    }
}

class Db implements Data {
    String getFromTable() {
        return "data from table";
    }

    @Override
    public String getData() {
        return getFromTable();
    }
}

class FileSystem implements Data{
    String getDataFromFs() {
        return "data from fs";
    }

    @Override
    public String getData() {
        return getDataFromFs();
    }
}
