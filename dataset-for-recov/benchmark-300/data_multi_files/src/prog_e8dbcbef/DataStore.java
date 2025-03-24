import java.util.Stack;

public class DataStore {
    private Stack<Integer> stack = new Stack<>();

    public void storeData(int value) {
        /* write */ stack.push(value);
    }

    public int retrieveData() {
        return stack.pop();
    }
}
