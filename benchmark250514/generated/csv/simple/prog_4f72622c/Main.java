import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Prepare a sample CSV content
            String csvContent = "name, age\nJohn Doe, 30";
            StringReader reader = new StringReader(csvContent);

            // Parse the CSV content
            CSVParser parser = new CSVParser(reader, format);
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method to check if a column is mapped
            /* read */ boolean isMapped = record.isMapped("name");

            // Output the result
            System.out.println("Is 'name' column mapped? " + isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}