import java.util.concurrent.LinkedTransferQueue;

public class Student {
    private String name;
    private DataProcessor dataProcessor = new DataProcessor();

    public Student(String name) {
        this.name = name;
    }

    public void processData(int data) {
        dataProcessor.processData(data);
    }

    public LinkedTransferQueue<Integer> getQueue() {
        return dataProcessor.getQueue();
    }
}
