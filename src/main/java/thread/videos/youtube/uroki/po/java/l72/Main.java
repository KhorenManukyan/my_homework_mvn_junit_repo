package thread.videos.youtube.uroki.po.java.l72;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NameList nameList = new NameList();
        nameList.add("first");

        class MyThread extends Thread{
            @Override
            public void run() {
                System.out.println(nameList.removeFirst());
            }
        }
        new MyThread().start();
        new MyThread().start();
    }

    static class NameList{
        List<String> list = Collections.synchronizedList(new ArrayList<>());

        public void add(String name){
            list.add(name);
        }

        public synchronized String removeFirst(){
            if (list.size()>0){
                if (Thread.currentThread().getName().equals("one")){
                    Thread.yield();
                }
                return list.remove(0);
            }
            return null;
        }
    }
}
