import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV configuration and configure format
            CSVConfiguration config = new CSVConfiguration();
            config.configureFormat();

            // Sample CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";

            // Parse CSV data
            CSVDataParser parser = new CSVDataParser(csvData, config.getFormat());
            List<CSVRecord> records = parser.getRecords();

            // Create student list
            List<Student> students = new ArrayList<>();
            for (CSVRecord record : records) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                students.add(new Student(name, age));
            }

            // Use read method on the first record
            /* read */ boolean isConsistent = records.get(0).isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);

            // Print student details
            for (Student student : students) {
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}