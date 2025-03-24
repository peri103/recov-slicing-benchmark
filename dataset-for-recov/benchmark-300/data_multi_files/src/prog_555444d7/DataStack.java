import java.util.Stack;

public class DataStack {
    private Stack<Integer> stack = new Stack<>();

    public void pushValue(int value) {
        /* write */ stack.push(value);
    }

    public Stack<Integer> getStack() {
        return stack;
    }
}
