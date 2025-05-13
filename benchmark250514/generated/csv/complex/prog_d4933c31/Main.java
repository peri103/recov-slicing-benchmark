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
            // Initialize the CSVFormat with a custom record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator("|\n");

            // Prepare to write to a StringWriter to capture the output
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write multiple records
            List<List<String>> records = Arrays.asList(
                Arrays.asList("value1", "value2", "value3"),
                Arrays.asList("value4", "value5", "value6"),
                Arrays.asList("value7", "value8", "value9")
            );

            for (List<String> record : records) {
                printer.printRecord(record);
            }
            printer.flush();

            // Intermediate unrelated computations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 natural numbers: " + sum);

            // Read the CSVRecords from the StringWriter
            String csvContent = writer.toString();
            List<CSVRecord> csvRecords = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords();

            // Process the records
            for (CSVRecord record : csvRecords) {
                System.out.println("Processing record: " + record);
            }

            // Use the read method on the first record
            CSVRecord firstRecord = csvRecords.get(0);
            /* read */ String recordString = firstRecord.toString();
            System.out.println("First record string: " + recordString);

            // Further unrelated computations
            int product = 1;
            for (int i = 1; i <= 5; i++) {
                product *= i;
            }
            System.out.println("Product of first 5 natural numbers: " + product);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}