import java.util.Stack;

public class DataStack {
    private Stack<Integer> stack = new Stack<>();

    public void pushData(int value) {
        /* write */ stack.push(value);
    }

    public int popData() {
        return stack.pop();
    }
}
