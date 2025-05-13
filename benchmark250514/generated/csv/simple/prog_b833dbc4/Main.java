import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom delimiter
            CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
            /* write */ format = format.withDelimiter(';'); // Ensuring write method is executed once

            // Sample CSV data
            String csvData = "name;age;city\nJohn;30;New York\nAlice;25;Los Angeles";

            // Parsing the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Reading the first record
            /* read */ String recordString = records.get(0).toString(); // Ensuring read method is executed once

            // Output the result
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}