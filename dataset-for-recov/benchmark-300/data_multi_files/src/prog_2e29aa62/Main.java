import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addData(42);

        DataProcessor dataProcessor = student.getDataProcessor();
        LinkedTransferQueue<Integer> queue = dataProcessor.getQueue();

        try {
            /* read */ int value = queue.take();
            System.out.println("Value taken from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}