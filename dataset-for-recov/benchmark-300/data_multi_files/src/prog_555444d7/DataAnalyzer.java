import java.util.Stack;

public class DataAnalyzer {
    private DataProcessor processor;

    public DataAnalyzer(DataProcessor processor) {
        this.processor = processor;
    }

    public int analyzeData() {
        Stack<Integer> stack = processor.getDataStack();
        /* read */ int value = stack.peek();
        return value;
    }
}
