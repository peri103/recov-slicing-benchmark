import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

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

            // Additional complex operations
            CSVFormat quoteCsvFormat = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
            String quotedCsvData = "\"name\",\"age\"\n\"Alice\",\"23\"\n\"Bob\",\"29\"";
            CSVParser quotedParser = new CSVParser(new StringReader(quotedCsvData), quoteCsvFormat);

            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord csvRecord : quotedParser) {
                names.add(csvRecord.get(0));
            }

            // Read a CSVRecord and check consistency
            for (CSVRecord csvRecord : parser) {
                /* read */ boolean isConsistent = csvRecord.isConsistent();
                System.out.println("Is record consistent: " + isConsistent);
            }

            // Process names
            for (String name : names) {
                System.out.println("Quoted name: " + name);
            }

            // Close the parsers
            parser.close();
            quotedParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}