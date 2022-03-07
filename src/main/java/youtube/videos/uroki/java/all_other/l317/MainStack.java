package youtube.videos.uroki.java.all_other.l317;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        for (String s: stack){
            System.out.println(s);
        }

    }
}
