import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat and configure it
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);

            // Create a sample CSV data
            String csvData = "name,age\nJohn,30\n\nJane,25";

            // Parse the CSV data using the configured format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Iterate over the records and check if a specific field is set
            for (CSVRecord record : parser) {
                /* read */ boolean isNameSet = record.isSet("name");
                System.out.println("Is 'name' set in record: " + isNameSet);
            }

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}