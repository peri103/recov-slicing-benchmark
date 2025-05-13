import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "# This is a comment\n" +
                             "header1,header2\n" +
                             "value1,value2";

            // Handling CSV data
            CSVHandler csvHandler = new CSVHandler(csvData);
            CSVReader csvReader = new CSVReader(csvHandler.getRecords());
            String comment = csvReader.getFirstComment();
            System.out.println("Original Comment: " + comment);

            // Unrelated operations for complexity
            Student student1 = new Student("Alice", 1);
            Student student2 = new Student("Bob", 2);
            Course course = new Course("Mathematics");

            course.addStudent(student1);
            course.addStudent(student2);

            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName() + ", ID: " + student.getStudentId());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}