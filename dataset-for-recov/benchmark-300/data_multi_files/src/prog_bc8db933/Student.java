public class Student {
    private String name;
    private DataProcessor dataProcessor = new DataProcessor();

    public Student(String name) {
        this.name = name;
    }

    public void processData(int value) {
        dataProcessor.processData(value);
    }

    public ConcurrentLinkedDeque<Integer> getDataQueue() {
        return dataProcessor.getDataQueue();
    }
}
