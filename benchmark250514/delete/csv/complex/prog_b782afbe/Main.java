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
            // Initialize the StringWriter to capture the output of CSVPrinter
            StringWriter writer = new StringWriter();

            // Create a CSVFormat instance and configure it with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');

            // Create a CSVPrinter using the configured CSVFormat
            CSVPrinter printer = new CSVPrinter(writer, format);
            
            // Write multiple records to the CSVPrinter
            printer.printRecord(Arrays.asList("value1", "value2", "value3"));
            printer.printRecord(Arrays.asList("value4", "value5", "value6"));
            printer.printRecord(Arrays.asList("value7", "value8", "value9"));

            // Flush the printer to ensure all data is written to the StringWriter
            printer.flush();

            // Capture the output as a CSVRecord
            String csvOutput = writer.toString();
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(csvOutput).getRecords();

            // Perform some operations on the records
            for (CSVRecord record : records) {
                System.out.println("Record Size: " + record.size());
                System.out.println("First Value: " + record.get(0));
            }

            // Use the read method to read the value written by the write method
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);

            // Additional complex operations
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i * i;
            }
            System.out.println("Sum of squares: " + sum);

            // Create another CSVFormat and CSVPrinter for additional complexity
            CSVFormat anotherFormat = CSVFormat.DEFAULT.withDelimiter(';');
            StringWriter anotherWriter = new StringWriter();
            CSVPrinter anotherPrinter = new CSVPrinter(anotherWriter, anotherFormat);

            anotherPrinter.printRecord(Arrays.asList("A", "B", "C"));
            anotherPrinter.printRecord(Arrays.asList("D", "E", "F"));
            anotherPrinter.flush();

            String anotherCsvOutput = anotherWriter.toString();
            List<CSVRecord> anotherRecords = CSVFormat.DEFAULT.parse(anotherCsvOutput).getRecords();

            for (CSVRecord anotherRecord : anotherRecords) {
                System.out.println("Another Record: " + anotherRecord);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}