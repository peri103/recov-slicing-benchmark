import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true); /* write */

            // Simulating CSV parsing using the format
            String csvData = "column1,column2\nvalue1,value2";
            CSVParser parser = CSVParser.parse(csvData, format);
            List<CSVRecord> records = parser.getRecords();

            // Reading the CSVRecord using the read method
            boolean isConsistent = records.get(0).isConsistent(); /* read */
            System.out.println(isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}