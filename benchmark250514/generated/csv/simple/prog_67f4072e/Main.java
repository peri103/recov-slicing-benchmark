import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with a null string representation
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withNullString("NULL");

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nAlice,NULL";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Iterate over the records
            for (CSVRecord record : parser) {
                // Check if the 'age' field is set
                /* read */ boolean isAgeSet = record.isSet("age");

                System.out.println("Is 'age' set for this record? " + isAgeSet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}