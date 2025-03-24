import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        List<Student> students = new ArrayList<>();

        // Create students and add scores
        Student student1 = new Student("Alice");
        student1.addScore(90);
        student1.addScore(85);

        Student student2 = new Student("Bob");
        student2.addScore(78);
        student2.addScore(92);

        students.add(student1);
        students.add(student2);

        // Process data
        processor.processData(100);

        // Create a course and display student scores
        Course course = new Course("Mathematics", students);
        course.displayStudentScores();

        // Retrieve processed data
        int processedData = processor.getProcessedData();
        System.out.println("Processed Data: " + processedData);
    }
}