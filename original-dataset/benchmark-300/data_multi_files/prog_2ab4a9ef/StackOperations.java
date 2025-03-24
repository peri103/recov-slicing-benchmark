import java.util.Stack;

public class StackOperations {
    private Stack<Integer> stack = new Stack<>();

    public void pushValue(int value) {
        /* write */ stack.push(value);
    }

    public int peekValue() {
        return stack.peek();
    }
}
