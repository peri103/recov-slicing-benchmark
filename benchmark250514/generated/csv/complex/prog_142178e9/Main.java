import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator("\n");

            // Prepare StringWriter and CSVPrinter
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Print multiple records
            printer.printRecord(Arrays.asList("value1", "value2", "value3"));
            printer.printRecord(Arrays.asList("value4", "value5", "value6"));
            printer.flush();

            // Create a list to store CSV strings
            List<String> csvStrings = new ArrayList<>();
            csvStrings.add(writer.toString());

            // Parse CSV and retrieve records
            CSVRecord record1 = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvStrings.get(0))).getRecords().get(0);
            CSVRecord record2 = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvStrings.get(0))).getRecords().get(1);

            // Unrelated complex operations
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }

            for (int num : numbers) {
                System.out.println("Number: " + num);
            }

            // More operations on CSV records
            String recordString1 = record1.toString();
            String recordString2 = record2.toString();

            // Use the read method
            /* read */ String recordString = record1.toString();
            System.out.println(recordString);

            // Print additional CSV records
            System.out.println(recordString2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}