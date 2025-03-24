public class Student {
    private String name;
    private DataProcessor dataProcessor = new DataProcessor();

    public Student(String name) {
        this.name = name;
    }

    public void processStudentData(int data) {
        dataProcessor.processData(data);
    }

    public ConcurrentLinkedQueue<Integer> getProcessedData() {
        return dataProcessor.getDataQueue();
    }
}
