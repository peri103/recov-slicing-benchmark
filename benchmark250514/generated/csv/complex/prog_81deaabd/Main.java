import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVPrinter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Create a StringWriter to write CSV data
            StringWriter writer = new StringWriter();

            // Initialize CSVPrinter with the format
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Adding records to the printer
            printer.printRecord("Name", "Age");
            printer.printRecord("John\\, Doe", 30);
            printer.printRecord("Jane, Doe", 25);

            // Flush the printer to write data to the writer
            printer.flush();

            // Sample CSV data
            String csvData = writer.toString();

            // Parse CSV data using the format with escape character
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Unrelated operations to add complexity
            List<String> names = new ArrayList<>();
            for (CSVRecord rec : parser.getRecords()) {
                names.add(rec.get(0));
            }

            // Perform some operations on the names list
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.toString();

            // Print the record as a string
            System.out.println(value);

            // Additional unrelated operations
            int sumOfAges = 0;
            for (CSVRecord rec : parser.getRecords()) {
                sumOfAges += Integer.parseInt(rec.get(1));
            }
            System.out.println("Sum of ages: " + sumOfAges);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}