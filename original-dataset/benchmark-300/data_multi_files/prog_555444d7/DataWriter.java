import java.util.Stack;

public class DataWriter {
    private Stack<Integer> stack = new Stack<>();

    public void writeData(int value) {
        /* write */ stack.push(value);
    }

    public Stack<Integer> getStack() {
        return stack;
    }
}
