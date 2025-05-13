import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            CSVUtils csvUtils = new CSVUtils();

            // Prepare sample CSV data
            String csvData = "# This is a header comment\n" +
                             "name,age\n" +
                             "John,30\n" +
                             "Jane,25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), csvUtils.getFormat());
            List<CSVRecord> records = parser.getRecords();

            // Create and manipulate Student objects
            Student student1 = new Student("John", 30);
            Student student2 = new Student("Jane", 25);

            student1.enrollCourse("Math");
            student1.enrollCourse("Science");

            student2.enrollCourse("History");

            System.out.println("Student 1: " + student1.getName());
            System.out.println("Courses: " + student1.getCourses());

            System.out.println("Student 2: " + student2.getName());
            System.out.println("Courses: " + student2.getCourses());

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println(comment);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}