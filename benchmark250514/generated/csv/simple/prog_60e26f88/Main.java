import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with a specified null string
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withNullString("NULL");

            // Sample CSV data
            String csvData = "id,name\n1,John\n2,NULL\n3,Alice";
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve records
            for (CSVRecord record : parser) {
                // Check if a specific column is set
                /* read */ boolean isSet = record.isSet("name");
                System.out.println("Is 'name' set for record: " + isSet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}