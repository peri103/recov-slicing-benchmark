import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name,Age,Location\nJohn,25,USA\nDoe,30,UK";

        try {
            // Initialize CSVFormat with header
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a column is mapped
            /* read */ boolean isNameMapped = record.isMapped("Name");

            // Output the result
            System.out.println("Is 'Name' column mapped? " + isNameMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}