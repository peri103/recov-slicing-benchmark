import java.util.Stack;

public class StackOperations {
    private Stack<Integer> stack = new Stack<>();

    public void pushToStack(int value) {
        /* write */ stack.push(value);
    }

    public int popFromStack() {
        return stack.pop();
    }
}
