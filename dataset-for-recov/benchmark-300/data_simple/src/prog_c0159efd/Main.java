import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        /* write */ stack.push(1);
        /* read */ int value = stack.pop();
        System.out.println(value);
    }
}