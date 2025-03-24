public class Student {
    private String name;
    private DataProcessor dataProcessor = new DataProcessor();

    public Student(String name) {
        this.name = name;
    }

    public void processData(int data) {
        dataProcessor.processData(data);
    }

    public DataProcessor getDataProcessor() {
        return dataProcessor;
    }
}
