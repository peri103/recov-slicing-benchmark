import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom record separator
            CSVFormat format = CSVFormat.DEFAULT /* write */.withRecordSeparator(";");

            // Prepare data to write
            List<String> data = Arrays.asList("value1", "value2", "value3");

            // Use StringWriter to capture the output
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write data to CSV
            printer.printRecord(data);
            printer.flush();

            // Create a list of CSV records for more complexity
            List<CSVRecord> csvRecords = new ArrayList<>();
            String csvContent = writer.toString();
            csvRecords.addAll(CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords());

            // Additional operations to increase complexity
            List<String> additionalData = Arrays.asList("extra1", "extra2", "extra3");
            StringWriter additionalWriter = new StringWriter();
            CSVPrinter additionalPrinter = new CSVPrinter(additionalWriter, CSVFormat.DEFAULT.withRecordSeparator("\n"));
            additionalPrinter.printRecord(additionalData);
            additionalPrinter.flush();
            csvRecords.addAll(CSVFormat.DEFAULT.parse(new java.io.StringReader(additionalWriter.toString())).getRecords());

            // Further processing on CSV records
            for (CSVRecord rec : csvRecords) {
                System.out.println("Processing record: " + rec);
            }

            // Convert the first written CSV to a CSVRecord
            CSVRecord record = csvRecords.get(0);

            // Read the CSVRecord
            /* read */ String recordString = record.toString();
            System.out.println("Read record: " + recordString);

            // Additional unrelated logic to increase complexity
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of numbers: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}