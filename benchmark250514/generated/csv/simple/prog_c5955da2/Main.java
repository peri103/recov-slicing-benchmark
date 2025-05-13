import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT /* write */.withIgnoreSurroundingSpaces();

            String csvData = "name, age\nJohn, 30";
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' set: " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}