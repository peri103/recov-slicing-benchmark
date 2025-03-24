public class Student {
    private String name;
    private DataProcessor dataProcessor = new DataProcessor();

    public Student(String name) {
        this.name = name;
    }

    public void addData(int data) {
        dataProcessor.addData(data);
    }

    public Stack<Integer> getDataStack() {
        return dataProcessor.getDataStack();
    }
}
