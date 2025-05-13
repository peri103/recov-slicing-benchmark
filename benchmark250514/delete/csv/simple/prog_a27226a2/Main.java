import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Prepare CSV data
        String csvData = "name,age\nJohn,30\nDoe,25";

        try {
            // Create CSVFormat with the first record as header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if the record is mapped (has headers)
            /* read */ boolean isMapped = record.isMapped();

            // Output the result
            System.out.println("Is the record mapped? " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}