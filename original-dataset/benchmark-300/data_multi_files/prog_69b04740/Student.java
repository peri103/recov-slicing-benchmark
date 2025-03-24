public class Student {
    private String name;
    private DataProcessor dataProcessor = new DataProcessor();

    public Student(String name) {
        this.name = name;
    }

    public void submitData(int data) throws InterruptedException {
        dataProcessor.processData(data);
    }

    public int getData() throws InterruptedException {
        return dataProcessor.retrieveData();
    }

    public String getName() {
        return name;
    }
}
