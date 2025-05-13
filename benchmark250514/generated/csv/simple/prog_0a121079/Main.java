import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific null string
            CSVFormat format = CSVFormat.DEFAULT /* write */.withNullString("NULL");

            // Create a sample CSV data
            String csvData = "name,age\nJohn,30\nJane,NULL";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the records
            for (CSVRecord record : parser) {
                // Check if a specific field is set
                boolean isSet = /* read */ record.isSet("age");
                System.out.println("Is 'age' set: " + isSet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}