import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSV format
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Prepare a CSV input for parsing
            String csvData = "Name, Age\nJohn Doe, 29\n\nJane Doe, 25";
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Read the records from the parser
            for (CSVRecord record : parser) {
                /* read */ boolean isSet = record.isSet("Name");
                System.out.println("Is 'Name' set: " + isSet);
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}