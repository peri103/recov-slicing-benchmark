import java.util.Stack;

public class DataProcessor {
    private Stack<Integer> dataStack = new Stack<>();

    public void addData(int data) {
        /* write */ dataStack.push(data);
    }

    public Stack<Integer> getDataStack() {
        return dataStack;
    }
}
