import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "name,age,city\nJohn,25,New York\n\nJane,30,Los Angeles";

        try {
            // Create a CSVFormat object with ignoring empty lines
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines();

            // Parse the CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Get the iterator for the records
            Iterator<CSVRecord> iterator = records.iterator();

            // Read the first record
            if (iterator.hasNext()) {
                CSVRecord record = iterator.next();
                // Check if the 'name' column is set
                /* read */ boolean isNameSet = record.isSet("name");
                System.out.println("Is 'name' set in the first record? " + isNameSet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}