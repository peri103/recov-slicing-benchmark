import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a record into the CSV
            /* write */ printer.printRecord("value1", "value2", "value3");

            // Flush the printer to ensure all data is written
            printer.flush();

            // Parse the written CSV data using CSVParser
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);

            // Read the first record from the parser
            CSVRecord record = parser.getRecords().get(0);

            // Retrieve the first value from the record
            /* read */ String value = record.get(0);

            // Print the retrieved value
            System.out.println(value);

            // Close resources
            printer.close();
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}