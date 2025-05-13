import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and set a null string representation
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

            // Prepare a CSV input string with a null value
            String csvData = "name,age\nJohn,NULL\nDoe,25";
            
            // Parse the CSV data using the format with null string
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Check if the 'age' field is set (it should be null)
            /* read */ boolean isAgeSet = record.isSet("age");
            
            // Output the result
            System.out.println("Is 'age' field set? " + isAgeSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}