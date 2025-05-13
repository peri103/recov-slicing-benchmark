import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Sample CSV data
        String csvData = "name,age,city\nJohn,NULL,New York\nJane,30,NULL";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Access a specific record and check if a column is set
            CSVRecord record = records.get(0); // First record
            /* read */ boolean isSet = record.isSet("age");

            System.out.println("Is 'age' set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}