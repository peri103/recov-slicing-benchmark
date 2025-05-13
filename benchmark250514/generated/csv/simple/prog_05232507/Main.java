import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with a null string
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

            // Sample CSV data
            String csvData = "name,age\nJohn,25\nDoe,NULL";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                // Check if the 'age' field is set for the record
                /* read */ boolean isAgeSet = record.isSet("age");
                System.out.println("Is 'age' set for the record? " + isAgeSet);
            }
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}