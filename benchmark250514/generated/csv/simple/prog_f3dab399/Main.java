import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat object
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Prepare a CSV string
            String csvData = "id,name\n1,John Doe\n2,Jane Doe\n\n3,Bob Smith";

            // Parse the CSV string using the CSVFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Check if a column is set
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' column set in the first record? " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}