import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "# This is a comment\nName, Age\nJohn, 30\nDoe, 25";
            CSVHandler csvHandler = new CSVHandler(csvData);

            // Process CSV records
            List<CSVRecord> records = csvHandler.getRecords();
            List<Student> students = new ArrayList<>();

            for (CSVRecord rec : records) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                students.add(new Student(name, age));
            }

            // Display student information
            for (Student student : students) {
                System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
            }

            // Read and print the comment from the first record
            CommentReader commentReader = new CommentReader(records.get(0));
            String comment = commentReader.readComment();
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}