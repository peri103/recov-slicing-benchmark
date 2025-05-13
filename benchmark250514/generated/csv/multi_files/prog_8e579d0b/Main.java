import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Doe", 30));
        students.add(new Student("Jane Doe", 25));

        // Process CSV data
        DataProcessor dataProcessor = new DataProcessor();
        String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";
        dataProcessor.processCSVData(csvData);

        // Print student details
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}