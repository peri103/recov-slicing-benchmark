import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVHandler and add a header comment
            CSVHandler csvHandler = new CSVHandler();
            csvHandler.addHeaderComment("This is a header comment");

            // Prepare a sample CSV data
            String csvData = "# This is a header comment\n" +
                             "Name, Age\n" +
                             "Alice, 30\n" +
                             "Bob, 25\n";

            // Parse the CSV data
            List<CSVRecord> records = csvHandler.parseCSV(csvData);

            // Create students and enroll them in courses
            Student alice = new Student("Alice");
            Student bob = new Student("Bob");

            Course math = new Course("Mathematics", 3);
            Course science = new Course("Science", 4);

            alice.enrollInCourse(math);
            bob.enrollInCourse(science);

            // Print student details
            for (Student student : List.of(alice, bob)) {
                System.out.println("Student: " + student.getName());
                for (Course course : student.getCourses()) {
                    System.out.println("Enrolled in: " + course.getCourseName() + " (" + course.getCredits() + " credits)");
                }
            }

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}