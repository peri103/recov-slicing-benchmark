import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        List<Student> students = new ArrayList<>();
        
        // Adding some students
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 78));
        
        // Thread to write the student score
        Thread writerThread = new Thread(() -> {
            processor.writeData(students.get(0).getScore());
        });
        
        // Some unrelated operations
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getScore());
        }
        
        // Thread to read the student score
        Thread readerThread = new Thread(() -> {
            int score = processor.readData();
            System.out.println("Processed score: " + score);
        });
        
        // Start the threads
        writerThread.start();
        readerThread.start();
        
        // Wait for threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}