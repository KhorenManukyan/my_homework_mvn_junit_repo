package youtube.videos.uroki.java.generics.g4;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Job job = new Job();
        job.doIt();
        Cell<ChildJob> cell = new Cell<>();
        cell.setT(new ChildJob());
        cell.doJob();
    }
}

class Job implements Serializable{
    void doIt(){
        System.out.println("do it");
    }
}

class ChildJob extends Job{

}


class Cell<T extends Job & Serializable>{
    T t;
    T getT(){
        return t;
    }

    void setT(T t){
        this.t = t;
    }

    void doJob(){
        t.doIt();
    }
}