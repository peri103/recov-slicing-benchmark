import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with the specified setting
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "id,name\n1,John Doe\n2,Jane Smith\n\n3,Bob Johnson";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Read the first record to check if it's consistent
            /* read */ boolean isConsistent = records.get(0).isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}