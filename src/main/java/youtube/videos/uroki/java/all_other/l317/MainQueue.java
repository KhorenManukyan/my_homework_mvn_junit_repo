package youtube.videos.uroki.java.all_other.l317;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("for");
        queue.offer("five");
        queue.offer("six");
        queue.offer("seven");

//        queue.offer("eight");
//        System.out.println(queue.peek());
        queue.remove();
//        System.out.println(remove);
//        System.out.println(queue.poll());
        for (String s: queue){
            System.out.println(s);
        }
    }
}
