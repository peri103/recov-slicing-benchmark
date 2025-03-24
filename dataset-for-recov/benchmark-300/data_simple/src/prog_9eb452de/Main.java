import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        /* write */ stack.push(1);
        /* read */ int value = (Integer) stack.peek();
        System.out.println(value);
    }
}