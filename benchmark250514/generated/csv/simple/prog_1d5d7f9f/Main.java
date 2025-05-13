import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSV format with a header
        CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");
        String csvData = "Name,Age,Country\nJohn,30,USA\nJane,25,UK";

        try {
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Iterate over the records
            for (CSVRecord record : parser) {
                // Check if a specific header is set
                /* read */ boolean isNameSet = record.isSet("Name");
                System.out.println("Is 'Name' header set? " + isNameSet);
                break; // Ensure the read method is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}