import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom record separator
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withRecordSeparator(";");

            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVPrinter to write data using the format
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write multiple records to the CSV
            printer.printRecord("John", "Doe", "john.doe@example.com");
            printer.printRecord("Jane", "Smith", "jane.smith@example.com");

            // Add more complexity by manipulating data
            List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
            for (String name : names) {
                printer.printRecord(name, "Unknown", name.toLowerCase() + "@example.com");
            }

            // Close the printer to flush data to the writer
            printer.close();

            // Intermediate processing of CSV data
            String csvData = writer.toString();
            String[] recordsArray = csvData.split(";");

            for (String recordStr : recordsArray) {
                System.out.println("Processing record: " + recordStr);
            }

            // Parse the CSV data to get a CSVRecord
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);

            // Additional unrelated processing
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += i;
            }
            System.out.println("Sum of first 5 integers: " + sum);

            // Use the read method to get the string representation of the CSVRecord
            /* read */ String recordString = record.toString();

            // Output the record string
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}