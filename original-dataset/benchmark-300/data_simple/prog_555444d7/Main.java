import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        /* write */ stack.push(42);
        /* read */ int value = stack.peek();
        System.out.println(value);
    }
}