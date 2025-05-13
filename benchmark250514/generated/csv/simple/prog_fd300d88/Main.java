import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with ignored header case
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreHeaderCase();

            // Sample CSV data
            String csvData = "Name,Age\nJohn,30\nDoe,25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a column is mapped (case-insensitive due to the format setting)
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println("Is 'name' mapped? " + isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}