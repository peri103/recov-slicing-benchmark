import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        /* write */ stack.push(42);
        /* read */ int value = (Integer) stack.pop();
        System.out.println(value);
    }
}