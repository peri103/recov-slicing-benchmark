import java.util.Stack;

public class StackManager {
    private Stack<Integer> stack = new Stack<>();

    public void pushValue(int value) {
        stack.push(value);
    }

    public int popValue() {
        return stack.pop();
    }

    public void printStack() {
        while (!stack.isEmpty()) {
            System.out.println("Stack value: " + stack.pop());
        }
    }
}
