import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        Student student = new Student("Alice");
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Create a separate thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            processor.writeData(42);
        });

        writerThread.start();

        // Add some unrelated operations to make the program more complex
        student.addScore(90);
        student.addScore(85);
        linkedList.add(30);
        linkedList.add(40);

        for (int score : student.getScores()) {
            linkedList.add(score);
        }

        // Read the data from the processor
        int value = processor.readData();
        System.out.println("Value from processor: " + value);

        // Print the contents of the linked list
        System.out.println("Linked List contents:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        // Print the student's name and scores
        System.out.println("Student: " + student.getName());
        System.out.println("Scores: " + student.getScores());
    }
}