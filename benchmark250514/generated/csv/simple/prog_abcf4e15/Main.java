import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a CSV input as a string
            String csvData = "header1,header2\nvalue1,value2\n,value4\nvalue5,value6";

            // Initialize CSVFormat and configure it to ignore empty lines
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines();

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read and check consistency of the first CSVRecord
            /* read */ boolean isConsistent = records.get(0).isConsistent();
            System.out.println(isConsistent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}