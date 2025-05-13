import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with allowing duplicate header names
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withAllowDuplicateHeaderNames(true);

        // Prepare a CSV string to parse
        String csvData = "header1,header1\nvalue1,value2";

        try {
            // Parse the CSV data using the csvFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Create a list to store CSV values
            ArrayList<String> csvValues = new ArrayList<>();

            // Add values from the CSVRecord to the list
            for (String value : record) {
                csvValues.add(value);
            }

            // Print the CSV values
            for (String value : csvValues) {
                System.out.println("CSV Value: " + value);
            }

            // Perform a complex operation on the list
            int sum = 0;
            for (String value : csvValues) {
                sum += value.length();
            }
            System.out.println("Sum of lengths: " + sum);

            // Check if the first column header is mapped
            /* read */ boolean isMapped = record.isMapped("header1");
            System.out.println("Is header1 mapped: " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}