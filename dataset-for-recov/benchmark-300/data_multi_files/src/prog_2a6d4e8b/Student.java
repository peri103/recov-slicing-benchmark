import java.util.concurrent.LinkedBlockingQueue;

public class Student {
    private String name;
    private DataProcessor dataProcessor = new DataProcessor();

    public Student(String name) {
        this.name = name;
    }

    public void processScore(int score) {
        dataProcessor.processData(score);
    }

    public LinkedBlockingQueue<Integer> getProcessedData() {
        return dataProcessor.getQueue();
    }
}
