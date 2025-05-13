import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a quote character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withQuote('"');

            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVPrinter to write to the StringWriter using the format
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a record to the CSVPrinter
            printer.printRecord("value1", "value2");

            // Flush the printer to ensure all data is written to the writer
            printer.flush();

            // Convert the written CSV data to a CSVRecord
            String csvOutput = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvOutput)).iterator().next();

            // Read the CSVRecord to string
            /* read */ String recordString = record.toString();

            // Print the CSVRecord string representation
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}