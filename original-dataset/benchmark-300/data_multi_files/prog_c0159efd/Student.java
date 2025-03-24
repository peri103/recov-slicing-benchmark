public class Student {
    private String name;
    private StackOperations stackOps = new StackOperations();

    public Student(String name) {
        this.name = name;
    }

    public void pushToStack(int value) {
        stackOps.pushValue(value);
    }

    public int popFromStack() {
        return stackOps.popValue();
    }
}
