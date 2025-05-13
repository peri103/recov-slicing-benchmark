import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withNullString("NULL");

            // Prepare a sample CSV input
            String csvData = "Name,Age,Location\nJohn,25,NULL\nDoe,30,USA";

            // Parse the CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));
            Iterator<CSVRecord> iterator = records.iterator();

            // Read the first record
            if (iterator.hasNext()) {
                CSVRecord record = iterator.next();
                /* read */ boolean isSet = record.isSet("Location");
                System.out.println(isSet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}