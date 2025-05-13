import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim option
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Prepare a sample CSV input
            String csvData = "Name, Age\nJohn Doe, 29";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            CSVParser parser = new CSVParser(reader, format);
            CSVRecord record = parser.getRecords().get(0);

            // Check if a column is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println(isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}