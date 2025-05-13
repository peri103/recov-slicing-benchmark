import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');

            // Sample CSV data
            String csvData = "Name;Age;Location\nJohn;30;USA\nDoe;25;UK";

            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read and print the first CSVRecord
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}