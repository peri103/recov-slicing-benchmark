import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "header1,header2,header3\nvalue1,value2,value3,"; // Note the trailing comma

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Check if a particular header is set in the first record
            /* read */ boolean isSet = records.get(0).isSet("header3");
            
            System.out.println("Is 'header3' set? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}