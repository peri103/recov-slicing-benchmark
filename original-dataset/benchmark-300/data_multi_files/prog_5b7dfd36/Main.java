import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        Student student = new Student("Alice");
        
        // Writing to the queue
        queueManager.writeToQueue(1);
        
        // Adding scores to the student
        student.addScore(90);
        student.addScore(85);
        
        // Reading from the queue
        int value = queueManager.readFromQueue();
        System.out.println("Value read from queue: " + value);
        
        // Displaying student scores
        System.out.println("Student scores: " + student.getScores());
    }
}