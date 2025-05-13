import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        try {
            // Create CSVUtils instance and parse CSV data
            CSVUtils csvUtils = new CSVUtils();
            String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";
            List<CSVRecord> records = csvUtils.parseCSV(csvData);

            // Create Student instances
            new Student("John Doe", 30);
            new Student("Jane Smith", 25);

            // Calculate average age and print names
            Student.calculateAverageAge();
            Student.printNames();

            // Check if 'name' is mapped in the CSV records
            boolean isMapped = Student.checkIsMapped(records);
            System.out.println("Is 'name' mapped: " + isMapped);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}