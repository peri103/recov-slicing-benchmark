import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "Name, Age, City\nAlice, 30, New York\nBob, 25, Los Angeles";

            // Create CSVProcessor and parse data
            CSVProcessor csvProcessor = new CSVProcessor();
            List<CSVRecord> records = csvProcessor.parseCSV(csvData);

            // Process records in Student
            Student student = new Student();
            student.processRecords(records);
            student.printAges();

            // Check if a column is set in the first record
            CSVRecord record = records.get(0);
            boolean isSet = csvProcessor.checkColumnSet(record, "Name");
            System.out.println("Is 'Name' set in the first record? " + isSet);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}