import java.util.Stack;

public class DataReader {
    private Stack<Integer> stack;

    public DataReader(Stack<Integer> stack) {
        this.stack = stack;
    }

    public int readData() {
        /* read */ return stack.peek();
    }
}
