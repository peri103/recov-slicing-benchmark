import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and set the quote character
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withQuote('"');

            // Sample CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 30, \"New York, USA\"";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            for (CSVRecord record : parser) {
                // Read the first record to a string
                /* read */ String recordString = record.toString();
                System.out.println(recordString);
                break; // Ensure the read method is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}