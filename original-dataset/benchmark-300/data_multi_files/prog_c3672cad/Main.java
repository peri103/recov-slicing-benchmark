import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 78));
        
        // Write a student's score to the queue
        int scoreToWrite = students.get(0).getScore();
        processor.writeData(scoreToWrite);
        
        // Process the list of students
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Score: " + student.getScore());
        }
        
        // Read the score from the queue
        int readScore = processor.readData();
        System.out.println("Read score from queue: " + readScore);
    }
}