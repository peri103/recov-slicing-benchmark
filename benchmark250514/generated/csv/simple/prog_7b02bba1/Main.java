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

            // Write a single value to the CSV
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Parse the CSV output
            String csvContent = writer.toString();
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);

            // Read the value back from the CSV
            /* read */ String value = record.get(0);
            System.out.println(value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}