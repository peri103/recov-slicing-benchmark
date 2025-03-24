import java.util.Stack;

public class StackManager {
    private Stack<Integer> stack = new Stack<>();

    public void pushToStack(int value) {
        stack.push(value);
    }

    public Stack<Integer> getStack() {
        return stack;
    }
}
