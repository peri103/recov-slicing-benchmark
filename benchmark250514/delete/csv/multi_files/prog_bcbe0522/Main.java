import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,Canada";

            // Initialize CSVUtils to parse CSV data
            CSVUtils csvUtils = new CSVUtils();
            CSVParser parser = csvUtils.parseCSV(csvData);

            // Parse students from CSV data
            List<Student> students = Student.parseStudents(parser);

            // Perform some operations on the students
            for (Student student : students) {
                System.out.println("Student: " + student.getName() + ", Age: " + student.getAge() + ", Location: " + student.getLocation());
            }

            // Read a specific CSV record and check if a header is mapped
            CSVRecord record = parser.getRecords().get(0);
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' mapped: " + isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}