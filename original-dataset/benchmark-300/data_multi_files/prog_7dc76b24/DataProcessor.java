import java.util.Stack;

public class DataProcessor {
    private Stack<Integer> dataStack = new Stack<>();

    public void processData(int value) {
        /* write */ dataStack.push(value);
    }

    public int getProcessedData() {
        return dataStack.pop();
    }
}
