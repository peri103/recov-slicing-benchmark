import java.util.Stack;

public class DataProcessor {
    private Stack stack = new Stack();

    public void writeData(int value) {
        /* write */ stack.push(value);
    }

    public Stack getStack() {
        return stack;
    }
}
