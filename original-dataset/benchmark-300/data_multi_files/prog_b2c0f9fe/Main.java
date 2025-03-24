import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        Student student = new Student("Alice");
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Start a new thread to write the value
        Thread writerThread = new Thread(() -> {
            try {
                queueManager.putValue(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        writerThread.start();
        
        // Add some unrelated operations
        for (int i = 0; i < 10; i++) {
            student.addScore(i);
            linkedList.add(i * 2);
        }
        
        // Print the student's scores and linked list
        System.out.println("Student " + student.getName() + " scores: " + student.getScores());
        System.out.println("LinkedList: " + linkedList);
        
        // Read the value in the main thread
        int value = queueManager.takeValue();
        System.out.println("Value from queue: " + value);
        
        // Ensure the writer thread completes
        writerThread.join();
        
        // More unrelated operations
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(i * 10);
        }
        
        System.out.println("Second ArrayList: " + list2);
        
        // Add elements from list2 to student's scores
        student.getScores().addAll(list2);
        System.out.println("Combined Student Scores: " + student.getScores());
    }
}