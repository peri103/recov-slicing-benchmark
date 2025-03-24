import java.util.Stack;

public class DataReader {
    private Stack stack;

    public DataReader(Stack stack) {
        this.stack = stack;
    }

    public int readData() {
        /* read */ return (Integer) stack.pop();
    }
}
