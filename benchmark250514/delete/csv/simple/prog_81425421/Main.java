import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat object with a specific delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withDelimiter(';');

        // Simulate a CSVRecord using the format with the delimiter
        // Here we use a simple string to demonstrate the read operation
        // In a real scenario, CSVRecord would be obtained from parsing a CSV file
        String csvData = "value1;value2;value3";
        CSVRecord record = format.parse(csvData).getRecords().get(0);

        // Read the CSVRecord
        /* read */ String recordString = record.toString();

        // Output the result
        System.out.println(recordString);
    }
}