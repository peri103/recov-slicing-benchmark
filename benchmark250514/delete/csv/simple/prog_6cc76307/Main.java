import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVFormat csvFormat = CSVFormat.DEFAULT;

        // Write operation
        /* write */ csvFormat = csvFormat.withDelimiter(';');

        List<String> data = Arrays.asList("Alice", "Bob", "Charlie");
        try {
            CSVPrinter csvPrinter = new CSVPrinter(writer, csvFormat);
            csvPrinter.printRecord(data);
            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read operation
        String csvData = writer.toString();
        String[] csvLines = csvData.split("\n");
        CSVRecord record = new CSVRecord(null, csvLines[0], null, csvFormat, 0, 0);

        /* read */ String value = record.toString();
        System.out.println(value);
    }
}