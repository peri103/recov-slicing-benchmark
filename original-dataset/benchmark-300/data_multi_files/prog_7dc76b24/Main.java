import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize DataProcessor
        DataProcessor processor = new DataProcessor();
        processor.processData(42);

        // Initialize students
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(90);
        student1.addScore(85);
        student2.addScore(78);
        student2.addScore(88);

        students.add(student1);
        students.add(student2);

        // Initialize Course
        Course course = new Course("Math", students);
        course.printStudentScores();

        // Get processed data
        /* read */ int value = processor.getProcessedData();
        System.out.println("Processed Data: " + value);
    }
}