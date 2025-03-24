import java.util.concurrent.BlockingDeque;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.processData(1);

        try {
            BlockingDeque<Integer> dataQueue = student.getDataProcessor().getDataQueue();
            /* read */ int value = dataQueue.takeFirst();
            System.out.println("Retrieved value from the queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}