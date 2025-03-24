import java.util.Stack;

public class DataStorage {
    private Stack<Integer> dataStack = new Stack<>();

    public void storeData(int value) {
        /* write */ dataStack.push(value);
    }

    public int retrieveData() {
        return dataStack.pop();
    }
}
