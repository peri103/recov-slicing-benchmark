import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with allowing missing column names
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withAllowMissingColumnNames(true);

            // Create a CSVParser with the format
            String csvData = "a,b,c\n1,2,3";
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if the record is consistent
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the record consistent? " + isConsistent);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}