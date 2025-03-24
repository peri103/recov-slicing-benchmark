import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        /* write */ stack.push(10);
        queue.add(20);
        queue.add(30);
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        for (int i = 0; i < 5; i++) {
            stack.push(i * 5);
        }
        /* read */ int value = stack.peek();
        System.out.println(value);
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}