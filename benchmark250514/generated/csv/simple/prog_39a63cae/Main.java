import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare to write CSV data
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write data to CSV
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Parse the written CSV data
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);

            // Read the data from the first record
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(0);

            // Print the value read from the CSV
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}