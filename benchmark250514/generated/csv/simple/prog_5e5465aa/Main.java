import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with a trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read the first record and check if the 'age' field is set
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isAgeSet = firstRecord.isSet("age");

            // Output the result
            System.out.println("Is 'age' field set in the first record? " + isAgeSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}