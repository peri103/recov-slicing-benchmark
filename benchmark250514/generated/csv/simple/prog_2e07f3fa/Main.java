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
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a record using CSVPrinter
            /* write */ csvPrinter.printRecord("John", "Doe", "30");
            csvPrinter.flush();

            // Read the record using CSVParser
            String csvData = writer.toString();
            CSVParser csvParser = CSVParser.parse(new StringReader(csvData), CSVFormat.DEFAULT);
            CSVRecord csvRecord = csvParser.getRecords().get(0);

            // Read a specific value from the CSVRecord
            /* read */ String firstName = csvRecord.get(0);
            System.out.println(firstName);

            // Close resources
            csvPrinter.close();
            csvParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}