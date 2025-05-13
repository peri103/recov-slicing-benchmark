import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student1 = new Student("John", "Doe", 20);
        Student student2 = new Student("Jane", "Smith", 22);

        course.addStudent(student1);
        course.addStudent(student2);

        // Parsing the CSV data from the course
        String csvData = course.getCSVData();
        try {
            StringReader reader = new StringReader(csvData);
            CSVParser parser = CSVParser.parse(reader, CSVFormat.DEFAULT);
            for (CSVRecord record : parser) {
                /* read */ String firstName = record.get(0);
                System.out.println("Student First Name: " + firstName);
                break; // Ensure the read operation is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}