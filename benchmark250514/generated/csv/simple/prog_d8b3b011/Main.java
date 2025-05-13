import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVPrinter with StringWriter
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a value to CSV
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Read the value from CSV
            String csvData = writer.toString();
            CSVParser parser = CSVParser.parse(new StringReader(csvData), CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(0);

            // Print the value read from CSV
            System.out.println(value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}