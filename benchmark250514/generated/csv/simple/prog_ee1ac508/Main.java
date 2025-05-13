import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a value using CSVPrinter
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Read the value using CSVRecord
            Reader reader = new StringReader(writer.toString());
            CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(0);

            // Print the value
            System.out.println(value);

            // Close resources
            csvPrinter.close();
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}