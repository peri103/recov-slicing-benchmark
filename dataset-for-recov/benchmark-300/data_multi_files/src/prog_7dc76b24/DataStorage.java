import java.util.Stack;

public class DataStorage {
    private Stack<Integer> stack = new Stack<>();

    public void storeData(int value) {
        /* write */ stack.push(value);
    }

    public int retrieveData() {
        return stack.pop();
    }
}
