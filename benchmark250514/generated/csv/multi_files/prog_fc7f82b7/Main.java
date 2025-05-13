import java.io.IOException;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "# This is a header comment\nName, Age\nJohn, 30\nDoe, 25";
            CSVHandler csvHandler = new CSVHandler(csvData);
            for (CSVRecord rec : csvHandler.getRecords()) {
                if (!rec.get(0).equals("Name")) { // Skip header
                    String name = rec.get(0);
                    int age = Integer.parseInt(rec.get(1));
                    Student student = new Student(name, age);
                    student.addCourseScore("Math", 85);
                    student.addCourseScore("Science", 90);
                    System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
                    System.out.println("Math Score: " + student.getCourseScore("Math"));
                    System.out.println("Science Score: " + student.getCourseScore("Science"));
                }
            }

            // Read the comment from the first record
            CSVRecord record = csvHandler.getRecords().get(0);
            /* read */ String comment = record.getComment();
            System.out.println("Header Comment: " + comment);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}