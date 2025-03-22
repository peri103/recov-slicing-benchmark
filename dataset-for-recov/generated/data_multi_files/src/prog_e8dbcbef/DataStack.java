import java.util.Stack;

public class DataStack {
    private Stack<Integer> stack = new Stack<>();

    public void pushData(int data) {
        /* write */ stack.push(data);
    }

    public Stack<Integer> getStack() {
        return stack;
    }
}
