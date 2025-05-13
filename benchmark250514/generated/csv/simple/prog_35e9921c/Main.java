import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSVFormat with a null string
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withNullString("NULL");

        // Prepare a CSV input
        String csvData = "name,age,city\nJohn,NULL,New York";
        StringReader stringReader = new StringReader(csvData);
        
        try {
            // Parse the CSV data using the CSVFormat
            CSVParser csvParser = new CSVParser(stringReader, csvFormat);
            List<CSVRecord> records = csvParser.getRecords();
            
            // Read the first record and check if the 'age' field is set
            CSVRecord record = records.get(0);
            /* read */ boolean isAgeSet = record.isSet("age");
            
            // Output the result
            System.out.println("Is 'age' set: " + isAgeSet);
            
            csvParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}