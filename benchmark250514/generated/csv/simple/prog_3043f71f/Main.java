import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare to write to CSV
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a value using CSVPrinter
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Prepare to read from CSV
            String csvData = writer.toString();
            CSVParser parser = CSVParser.parse(csvData, CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);

            // Read the value using CSVRecord
            /* read */ String value = record.get(0);
            System.out.println(value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}