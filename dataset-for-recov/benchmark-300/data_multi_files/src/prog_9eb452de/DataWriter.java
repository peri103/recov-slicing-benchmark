import java.util.Stack;

public class DataWriter {
    private Stack stack;

    public DataWriter(Stack stack) {
        this.stack = stack;
    }

    public void writeData(int value) {
        /* write */ stack.push(value);
    }
}
