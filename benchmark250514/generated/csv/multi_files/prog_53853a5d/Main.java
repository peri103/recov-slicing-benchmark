import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a course and add students
        Course course = new Course("Computer Science");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        course.addStudent(alice);
        course.addStudent(bob);

        // Add grades to students
        alice.addGrade(85);
        bob.addGrade(90);

        // Print student grades
        for (Student student : course.getStudents()) {
            System.out.println("Grades for " + student.getGrades());
        }

        // Use CSVHandler to parse CSV data
        CSVHandler csvHandler = new CSVHandler();
        String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

        try {
            List<CSVRecord> records = csvHandler.parseCSV(csvData);
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println("CSV Comment: " + comment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}