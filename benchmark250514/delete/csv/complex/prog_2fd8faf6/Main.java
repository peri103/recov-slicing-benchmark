import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK\nDoe,40,Canada";

        // Create a reader from the CSV data
        Reader reader = new StringReader(csvData);

        try {
            // Create CSVFormat with the first record as header and additional configurations
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withFirstRecordAsHeader().withQuoteMode(QuoteMode.ALL);

            // Parse the CSV data
            CSVParser csvParser = new CSVParser(reader, csvFormat);

            // Retrieve the header map
            Map<String, Integer> headerMap = csvParser.getHeaderMap();
            System.out.println("Header Map: " + headerMap);

            // Get the records
            List<CSVRecord> records = csvParser.getRecords();

            // Perform some unrelated operations
            int sumOfAges = 0;
            for (CSVRecord record : records) {
                int age = Integer.parseInt(record.get("Age"));
                sumOfAges += age;
            }
            System.out.println("Sum of Ages: " + sumOfAges);

            // Additional unrelated logic
            String[] locations = new String[records.size()];
            for (int i = 0; i < records.size(); i++) {
                locations[i] = records.get(i).get("Location");
            }
            for (String location : locations) {
                System.out.println("Location: " + location);
            }

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