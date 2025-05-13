import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        String csvData = "name,age\nJohn,NULL\nDoe,30";
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Access the first record
            CSVRecord record = records.get(0);
            
            // Use the read method
            /* read */ boolean isSet = record.isSet("age");
            System.out.println("Is 'age' set in the first record: " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}