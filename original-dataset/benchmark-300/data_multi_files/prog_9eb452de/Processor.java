import java.util.Stack;

public class Processor {
    private DataManager dataManager;

    public Processor(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public void processData() {
        Stack<Integer> stack = dataManager.getDataStack();
        if (!stack.isEmpty()) {
            /* read */ int value = stack.peek();
            System.out.println("Processed value: " + value);
        }
    }
}
