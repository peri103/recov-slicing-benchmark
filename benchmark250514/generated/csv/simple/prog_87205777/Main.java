import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write data using CSVPrinter
            /* write */ csvPrinter.printRecord("John", "Doe", "30");
            csvPrinter.flush();

            // Read data using CSVParser
            StringReader reader = new StringReader(writer.toString());
            CSVParser parser = CSVParser.parse(reader, CSVFormat.DEFAULT);
            for (CSVRecord record : parser) {
                /* read */ String firstName = record.get(0);
                System.out.println(firstName);
                break; // Ensure the read operation is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}