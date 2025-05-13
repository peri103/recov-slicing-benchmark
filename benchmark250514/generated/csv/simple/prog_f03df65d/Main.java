import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with quote character
            CSVFormat format = CSVFormat.DEFAULT /* write */.withQuote('"');

            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();

            // Create CSVPrinter using the format with quote
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a record to the CSVPrinter
            printer.printRecord("value1", "value2");

            // Flush and close the printer
            printer.flush();
            printer.close();

            // Read the CSV output as a CSVRecord
            String csvOutput = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvOutput)).getRecords().get(0);

            // Read the record's string representation
            /* read */ String recordString = record.toString();

            // Print the read value
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}