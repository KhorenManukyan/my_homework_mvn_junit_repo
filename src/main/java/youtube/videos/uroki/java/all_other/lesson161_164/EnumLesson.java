package youtube.videos.uroki.java.all_other.lesson161_164;

enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY
}

enum Level {
    BEGINNER("green"){
        public String getColor(){
            return "color is: " + color;
        }
    }, INTERMEDIATE("red"), EXPERT("blue");
    String color;


    Level(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Level{ color='" + color + '\'' +
                '}';
    }
}

public class EnumLesson {
    public static void main(String[] args) {
        Level.BEGINNER.setColor("blue");
        System.out.println(Level.BEGINNER.getColor());

    }
}
