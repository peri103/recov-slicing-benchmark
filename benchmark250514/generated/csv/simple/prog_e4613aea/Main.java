import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSVFormat with trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT /* write */.withTrailingDelimiter();

        // Sample CSV data
        String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles\n";

        try {
            // Parse the CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Assume we want to check if the 'city' column is set for the first record
            CSVRecord firstRecord = records.iterator().next();
            boolean isCitySet = /* read */ firstRecord.isSet("city");

            // Output the result
            System.out.println("Is 'city' column set for the first record? " + isCitySet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}