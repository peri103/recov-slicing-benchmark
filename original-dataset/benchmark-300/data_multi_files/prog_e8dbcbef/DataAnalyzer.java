import java.util.Stack;

public class DataAnalyzer {
    private Stack<Integer> dataStack;

    public DataAnalyzer(Stack<Integer> dataStack) {
        this.dataStack = dataStack;
    }

    public int analyzeData() {
        /* read */ int value = dataStack.pop();
        return value;
    }
}
