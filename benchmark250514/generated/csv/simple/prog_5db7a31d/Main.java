import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVPrinter
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a record
            /* write */ csvPrinter.printRecord("John", "Doe", "30");
            csvPrinter.flush();

            // Parse the written CSV content
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);

            // Read the record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);
            /* read */ String firstName = record.get(0);

            // Print the read value
            System.out.println(firstName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}