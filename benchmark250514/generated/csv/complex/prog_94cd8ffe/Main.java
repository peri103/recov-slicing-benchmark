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
            CSVFormat format = CSVFormat.DEFAULT /* write */.withRecordSeparator(';');

            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVPrinter to write data using the specified format
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write multiple records to the CSVPrinter
            List<List<String>> records = Arrays.asList(
                Arrays.asList("John", "Doe", "30"),
                Arrays.asList("Jane", "Smith", "25"),
                Arrays.asList("Mike", "Johnson", "40")
            );
            for (List<String> record : records) {
                printer.printRecord(record);
            }
            printer.flush();

            // Unrelated computation to add complexity
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i * i;
            }
            System.out.println("Sum of squares from 0 to 9: " + sum);

            // Read the CSV output
            String csvOutput = writer.toString();

            // Convert the CSV output to CSVRecords
            List<CSVRecord> csvRecords = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvOutput)).getRecords();

            // Process the records in a complex manner
            for (CSVRecord record : csvRecords) {
                // Perform some operations on each record
                int age = Integer.parseInt(record.get(2));
                if (age > 30) {
                    System.out.println("Age is greater than 30: " + age);
                }
            }

            // Read the first record using toString method
            CSVRecord firstRecord = csvRecords.get(0);
            /* read */ String recordString = firstRecord.toString();

            // Print the read value
            System.out.println("First record: " + recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}