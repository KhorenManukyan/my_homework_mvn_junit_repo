package intermediateTigran.thread.youtube.videos.com.lessons.uroki.lesson3;

public class MyThread extends Thread {
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.change();
    }
}
