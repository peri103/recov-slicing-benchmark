import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a specific delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withDelimiter(';');

        // Create a sample CSV string
        String csvData = "name;age;city\nJohn;30;New York\nJane;25;Los Angeles";
        
        // Parse the CSV string using the format with the specified delimiter
        List<CSVRecord> records = null;
        try {
            records = format.parse(new StringReader(csvData)).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Read the first record and convert it to a string
        if (records != null && !records.isEmpty()) {
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);
        }
    }
}