import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and configure it with the escape character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Prepare a StringWriter to capture CSV output
            StringWriter out = new StringWriter();
            CSVPrinter printer = new CSVPrinter(out, format);

            // Write some data using the configured format
            printer.printRecord("Name", "Age", "Location");
            printer.printRecord("John Doe", "30", "New York");
            printer.flush();

            // Additional logic: Create a list to store CSV data
            ArrayList<String> csvLines = new ArrayList<>();
            csvLines.add(out.toString());

            // Perform some unrelated operations to increase complexity
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            // Read the output back using CSVParser
            String csvData = csvLines.get(0);
            StringReader reader = new StringReader(csvData);
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(reader).getRecords();

            // Use the read method to get a string representation of a CSVRecord
            /* read */ String recordString = records.get(1).toString();
            System.out.println(recordString);

            // More operations on the CSV data
            for (CSVRecord record : records) {
                System.out.println("Record: " + record);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}