import java.util.Stack;

public class Processor {
    private DataHolder dataHolder;

    public Processor(DataHolder dataHolder) {
        this.dataHolder = dataHolder;
    }

    public void processData() {
        Stack<Integer> stack = dataHolder.getDataStack();
        if (!stack.isEmpty()) {
            /* read */ int value = stack.pop();
            System.out.println("Processed value: " + value);
        } else {
            System.out.println("No data to process.");
        }
    }
}
