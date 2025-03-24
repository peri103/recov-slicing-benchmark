import java.util.concurrent.BlockingDeque;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.processData(42);
        
        BlockingDeque<Integer> dataQueue = student.getDataProcessor().getDataQueue();
        try {
            /* read */ int value = dataQueue.takeLast();
            System.out.println("Processed Data: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}