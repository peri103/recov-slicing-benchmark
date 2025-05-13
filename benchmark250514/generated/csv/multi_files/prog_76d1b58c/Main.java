import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Configure CSV format
            CSVConfig config = new CSVConfig();
            config.configureFormat();

            // Create a CSVParser with the configured format
            String csvData = "a,b,c\n1,2,3";
            CSVParser parser = new CSVParser(new StringReader(csvData), config.getFormat());

            // Handle CSV data
            CSVDataHandler handler = new CSVDataHandler();
            handler.parseData(parser);

            // Check consistency of the first record
            boolean isConsistent = handler.checkFirstRecordConsistency();
            System.out.println("Is the first record consistent? " + isConsistent);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}