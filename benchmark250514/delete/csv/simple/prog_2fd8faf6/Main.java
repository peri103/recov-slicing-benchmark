import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";

        // Create a reader from the CSV data
        Reader reader = new StringReader(csvData);

        try {
            // Create CSVFormat with the first record as header
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser csvParser = new CSVParser(reader, csvFormat);

            // Get the records
            List<CSVRecord> records = csvParser.getRecords();

            // Check if the first record is mapped to the header
            /* read */ boolean isMapped = records.get(0).isMapped();

            // Print the result
            System.out.println("Is the first record mapped to the header? " + isMapped);

            // Close the parser
            csvParser.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}