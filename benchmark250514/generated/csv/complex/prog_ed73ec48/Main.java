import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVFormat instance and set a custom record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator(" | ");

            // Create a CSVPrinter to write data using the specified format
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a sample record
            printer.printRecord("Alice", "Bob", "Charlie");

            // Flush the printer to ensure all data is written
            printer.flush();

            // Additional code to increase complexity
            List<String> names = new ArrayList<>();
            names.add("David");
            names.add("Eva");
            names.add("Frank");

            for (String name : names) {
                printer.printRecord(name, name.length(), name.toUpperCase());
            }

            // Flush again to ensure all additional data is written
            printer.flush();

            // Parse the written data back into a CSVRecord
            String csvData = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);

            // Complex operations before reading
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            System.out.println("Sum of numbers: " + sum);

            // Read the record using the toString method
            /* read */ String recordString = record.toString();

            // Output the record string
            System.out.println(recordString);

            // More complex operations after reading
            List<Double> doubles = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                doubles.add(i * 1.5);
            }

            double product = 1.0;
            for (double d : doubles) {
                product *= d;
            }

            System.out.println("Product of doubles: " + product);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}