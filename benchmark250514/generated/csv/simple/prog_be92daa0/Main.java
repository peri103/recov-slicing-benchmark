import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a custom record separator
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withRecordSeparator("\n");

        // Sample CSV data
        String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,Los Angeles";

        try {
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read the first record and print it
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}