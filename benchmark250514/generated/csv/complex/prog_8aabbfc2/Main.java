import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "Name, Age, City\nJohn, 30, New York\nJane, 25, Los Angeles";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Perform some unrelated operations
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("Name", "Age", "City"));
            printer.printRecord("Alice", 28, "Chicago");
            printer.printRecord("Bob", 32, "San Francisco");
            printer.flush();

            // Print the generated CSV
            System.out.println("Generated CSV:");
            System.out.println(writer.toString());

            // More unrelated operations
            int sumAge = 0;
            for (CSVRecord rec : records) {
                sumAge += Integer.parseInt(rec.get("Age").trim());
            }
            System.out.println("Sum of ages: " + sumAge);

            // Check if a column is mapped
            /* read */ boolean isMapped = record.isMapped("Name");

            System.out.println("Is 'Name' column mapped? " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}