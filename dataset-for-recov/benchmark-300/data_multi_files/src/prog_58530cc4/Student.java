public class Student {
    private String name;
    private StackManager stackManager = new StackManager();

    public Student(String name) {
        this.name = name;
    }

    public void pushToStack(int value) {
        stackManager.pushValue(value);
    }

    public Stack<Integer> getStack() {
        return stackManager.getStack();
    }
}
