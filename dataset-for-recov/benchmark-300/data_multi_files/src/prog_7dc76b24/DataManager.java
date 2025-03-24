import java.util.Stack;

public class DataManager {
    private Stack<Integer> dataStack = new Stack<>();

    public void addData(int value) {
        /* write */ dataStack.push(value);
    }

    public Stack<Integer> getDataStack() {
        return dataStack;
    }
}
