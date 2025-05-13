import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV writer
            StringWriter writer = new StringWriter();
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Print records to CSV
            printer.printRecord(Arrays.asList("field1", "field2", "field3"));
            printer.printRecord(Arrays.asList("fieldA", "fieldB", "fieldC"));
            printer.flush();

            // Unrelated code to make program more complex
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }
            Collections.shuffle(numbers);
            System.out.println("Shuffled Numbers: " + numbers);

            // Parse CSV content
            String csvContent = writer.toString();
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords();

            // Additional unrelated operations
            List<String> fields = new ArrayList<>();
            for (CSVRecord record : records) {
                fields.add(record.get(0));
            }
            System.out.println("Fields extracted: " + fields);

            // Read CSV record
            CSVRecord firstRecord = records.get(0);
            /* read */ String recordString = firstRecord.toString();
            System.out.println("First Record: " + recordString);

            // More complex operations
            List<String> reversedFields = new ArrayList<>(fields);
            Collections.reverse(reversedFields);
            System.out.println("Reversed Fields: " + reversedFields);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}