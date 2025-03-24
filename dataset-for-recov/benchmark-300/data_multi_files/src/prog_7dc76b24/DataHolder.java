import java.util.Stack;

public class DataHolder {
    private Stack<Integer> stack = new Stack<>();

    public void pushData(int data) {
        /* write */ stack.push(data);
    }

    public int popData() {
        return stack.pop();
    }
}
