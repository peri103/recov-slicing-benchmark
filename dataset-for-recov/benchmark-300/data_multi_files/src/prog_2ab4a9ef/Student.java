public class Student {
    private String name;
    private StackOperations stackOperations = new StackOperations();

    public Student(String name) {
        this.name = name;
    }

    public void addValueToStack(int value) {
        stackOperations.pushValue(value);
    }

    public int getValueFromStack() {
        return stackOperations.peekValue();
    }
}
