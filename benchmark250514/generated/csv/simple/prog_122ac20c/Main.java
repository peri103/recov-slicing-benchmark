import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,25\n\nDoe,30";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);

            // Read a CSVRecord and check consistency
            for (CSVRecord csvRecord : parser) {
                /* read */ boolean isConsistent = csvRecord.isConsistent();
                System.out.println("Is record consistent: " + isConsistent);
            }

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}