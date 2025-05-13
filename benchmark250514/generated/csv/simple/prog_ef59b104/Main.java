import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        try {
            // Initialize CSVPrinter
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a record
            /* write */ printer.printRecord("value1", "value2", "value3");

            // Flush and close the printer
            printer.flush();
            printer.close();

            // Parse the written data
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(0);

            // Print the value
            System.out.println(value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}