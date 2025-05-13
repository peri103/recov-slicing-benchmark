import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom record separator
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator(";");

            // Sample CSV data to demonstrate reading
            String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";

            // Parse the CSV data using the format with the custom record separator
            CSVParser parser = CSVParser.parse(csvData, format);

            // Retrieve the records
            List<CSVRecord> records = parser.getRecords();

            // Read the first record and print it
            /* read */ CSVRecord record = records.get(0);
            System.out.println(record.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}