public class Student {
    private String name;
    private StackOperations stackOperations = new StackOperations();

    public Student(String name) {
        this.name = name;
    }

    public void addValueToStack(int value) {
        stackOperations.pushValue(value);
    }

    public Stack<Integer> getStack() {
        return stackOperations.getStack();
    }
}
