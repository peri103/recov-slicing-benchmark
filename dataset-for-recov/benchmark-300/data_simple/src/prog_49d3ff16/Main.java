import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        /* write */ stack.push(10);
        /* read */ int value = stack.peek();
        System.out.println(value);
    }
}