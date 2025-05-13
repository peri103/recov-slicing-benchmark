import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,UK";

            // Process CSV data
            CSVProcessor processor = new CSVProcessor();
            List<CSVRecord> records = processor.parseCSV(csvData);

            // Check if 'Name' header is mapped in the first record
            RecordChecker checker = new RecordChecker();
            boolean isMapped = checker.isHeaderMapped(records.get(0), "Name");
            System.out.println("Is 'Name' mapped: " + isMapped);

            // Create Student objects from CSV records
            List<Student> students = new ArrayList<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                String location = record.get("Location");
                students.add(new Student(name, age, location));
            }

            // Print student information
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}