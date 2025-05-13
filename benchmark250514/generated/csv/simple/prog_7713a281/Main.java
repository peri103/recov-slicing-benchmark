import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with the write method
            CSVFormat format = /* write */ CSVFormat.DEFAULT.withIgnoreEmptyLines();

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nJane,25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Access a CSVRecord and use the read method
            for (CSVRecord record : parser) {
                /* read */ boolean isSet = record.isSet("name");
                System.out.println("Is 'name' set? " + isSet);
            }

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}