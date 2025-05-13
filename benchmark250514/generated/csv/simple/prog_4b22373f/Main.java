import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "name, age\nAlice, 30\nBob, 25";
            
            // Create a CSVFormat instance with ignore surrounding spaces
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
            
            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Read the first record and check if a specific column is set
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isNameSet = firstRecord.isSet("name");
            
            System.out.println("Is 'name' set in the first record? " + isNameSet);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}