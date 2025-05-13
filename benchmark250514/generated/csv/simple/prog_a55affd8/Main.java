import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string representation
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

        // Sample CSV data
        String csvData = "name,age,city\nJohn,NULL,New York\nAlice,30,NULL";

        try {
            // Parse the CSV data into records
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));
            Iterator<CSVRecord> iterator = records.iterator();

            // Access the first record
            if (iterator.hasNext()) {
                CSVRecord record = iterator.next();

                // Check if a specific column is set (not null)
                /* read */ boolean isAgeSet = record.isSet("age");
                System.out.println("Is 'age' set in the first record? " + isAgeSet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}