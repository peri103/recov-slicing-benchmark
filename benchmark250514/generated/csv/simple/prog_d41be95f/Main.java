import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header
            CSVFormat csvFormat = CSVFormat.DEFAULT
                /* write */ .withHeader("Name", "Age", "Country");

            // Prepare a StringWriter to capture the output
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, csvFormat);
            
            // Print a record to the CSVPrinter
            csvPrinter.printRecord("Alice", "30", "USA");
            csvPrinter.flush();

            // Parse the written CSV content
            String csvContent = writer.toString();
            CSVRecord csvRecord = CSVFormat.DEFAULT
                .withHeader("Name", "Age", "Country")
                .parse(new java.io.StringReader(csvContent))
                .iterator().next();
            
            // Check if a header is set
            /* read */ boolean isSet = csvRecord.isSet("Name");
            System.out.println("Is 'Name' header set? " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}