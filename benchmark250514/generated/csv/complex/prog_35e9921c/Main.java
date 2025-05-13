import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSVFormat with a null string
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withNullString("NULL");

        // Prepare a CSV input
        String csvData = "name,age,city\nJohn,NULL,New York\nJane,25,Los Angeles";
        StringReader stringReader = new StringReader(csvData);
        
        try {
            // Parse the CSV data using the CSVFormat
            CSVParser csvParser = new CSVParser(stringReader, csvFormat);
            List<CSVRecord> records = csvParser.getRecords();
            
            // Additional code to demonstrate complexity
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get("name"));
            }
            
            // Perform some operations on the names
            for (String name : names) {
                System.out.println("Name: " + name);
            }
            
            // Read the first record and check if the 'age' field is set
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isAgeSet = firstRecord.isSet("age");
            
            // Output the result
            System.out.println("Is 'age' set in the first record: " + isAgeSet);
            
            // More operations
            for (CSVRecord record : records) {
                boolean isCitySet = record.isSet("city");
                System.out.println("Is 'city' set: " + isCitySet);
            }
            
            csvParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}