import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string representation
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Prepare a sample CSV input
        String csvData = "name,age\nJohn,NULL\nDoe,30";
        
        try {
            // Parse the CSV data using the format with null string
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            // Read the first record and check if the 'age' field is set
            CSVRecord record = parser.getRecords().get(0);
            /* read */ boolean isAgeSet = record.isSet("age");
            
            // Print the result
            System.out.println("Is 'age' set in the first record? " + isAgeSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}