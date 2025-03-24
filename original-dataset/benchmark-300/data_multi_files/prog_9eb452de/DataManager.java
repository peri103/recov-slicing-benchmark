import java.util.Stack;

public class DataManager {
    private Stack stack = new Stack();

    public void addData(int data) {
        /* write */ stack.push(data);
    }

    public Stack getStack() {
        return stack;
    }
}
