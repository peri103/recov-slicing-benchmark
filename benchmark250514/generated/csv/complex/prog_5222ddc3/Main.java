import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVFormat object and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Use CSVPrinter to write a record
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord("value1", "value2");
            printer.flush();

            // Additional complex operations
            ArrayList<String> list = new ArrayList<>();
            list.add("extra1");
            list.add("extra2");
            for (String item : list) {
                System.out.println("Processing: " + item);
            }

            // Parse the written CSV data into CSVRecord
            String csvData = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);

            // More complex operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

            // Read the record using the toString method
            /* read */ String value = record.toString();
            System.out.println(value);

            // Further complex operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 2);
            }
            for (int num : numbers) {
                System.out.println("Number: " + num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}