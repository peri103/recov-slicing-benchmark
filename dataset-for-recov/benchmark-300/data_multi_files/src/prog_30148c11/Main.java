import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        
        // Use a separate thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            queueManager.writeValue(42);
        });
        
        writerThread.start();
        
        // Additional unrelated code to make the program more complex
        Student student = new Student("Alice");
        student.addScore(90);
        student.addScore(85);
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 10);
        }
        
        for (int score : student.getScores()) {
            System.out.println("Student " + student.getName() + " score: " + score);
        }
        
        for (int value : linkedList) {
            System.out.println("LinkedList value: " + value);
        }
        
        int value = queueManager.readValue();
        System.out.println("Value from SynchronousQueue: " + value);
    }
}