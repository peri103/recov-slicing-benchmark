import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV utility and add header comment
            CSVUtils csvUtils = new CSVUtils();
            csvUtils.addHeaderComment("This is a comment");

            // Sample CSV content
            String csvData = "# This is a comment\nName,Age\nJohn,30\nDoe,25";

            // Parse the CSV content
            List<CSVRecord> records = csvUtils.parseCSV(csvData);

            // Create students based on CSV records
            Student john = new Student("John", 30);
            Student doe = new Student("Doe", 25);

            // Add some course grades
            john.addCourseGrade("Math", 90);
            john.addCourseGrade("Science", 85);
            doe.addCourseGrade("Math", 88);
            doe.addCourseGrade("Science", 92);

            // Print student details and course grades
            System.out.println(john.getName() + " (" + john.getAge() + " years old): " + john.getCourseGrades());
            System.out.println(doe.getName() + " (" + doe.getAge() + " years old): " + doe.getCourseGrades());

            // Read the comment from the first CSV record
            CSVRecord record = records.get(0);
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println("Header Comment: " + comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}