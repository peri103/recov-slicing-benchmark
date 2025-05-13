import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize CSVFormat and configure it
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Sample CSV data
        String csvData = "name,age\nJohn,30\nDoe,25";

        // Parse the CSV data
        Iterable<CSVRecord> records = format.parse(new StringReader(csvData));
        
        // Read the first record and check if it is consistent
        Iterator<CSVRecord> iterator = records.iterator();
        if (iterator.hasNext()) {
            CSVRecord record = iterator.next();
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);
        }
    }
}