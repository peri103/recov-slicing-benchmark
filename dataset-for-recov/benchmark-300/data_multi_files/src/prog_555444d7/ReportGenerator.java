import java.util.Stack;

public class ReportGenerator {
    private DataProcessor dataProcessor;

    public ReportGenerator(DataProcessor dataProcessor) {
        this.dataProcessor = dataProcessor;
    }

    public void generateReport() {
        Stack<Integer> stack = dataProcessor.getDataStack();
        /* read */ int value = stack.peek();
        System.out.println("Report Value: " + value);
    }
}
