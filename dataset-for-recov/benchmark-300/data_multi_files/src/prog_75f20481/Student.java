public class Student {
    private String name;
    private DataStack dataStack = new DataStack();

    public Student(String name) {
        this.name = name;
    }

    public void addData(int data) {
        dataStack.pushData(data);
    }

    public Stack<Integer> getDataStack() {
        return dataStack.getStack();
    }
}
