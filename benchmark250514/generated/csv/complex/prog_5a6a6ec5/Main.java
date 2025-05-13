import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with a trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withTrailingDelimiter();

        // Prepare a CSV input to parse
        String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles\n";
        
        try {
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
            
            // Create another CSVFormat instance for a different task
            CSVFormat anotherFormat = CSVFormat.EXCEL.withHeader();
            String anotherCsvData = "id,name,score\n1,Alice,85\n2,Bob,90\n";
            
            // Parse the second CSV data
            List<CSVRecord> anotherRecords = anotherFormat.parse(new StringReader(anotherCsvData)).getRecords();
            
            // Process the second CSV records
            for (CSVRecord rec : anotherRecords) {
                System.out.println("ID: " + rec.get("id") + ", Name: " + rec.get("name") + ", Score: " + rec.get("score"));
            }
            
            // Access a specific record from the first CSV and check if a column is set
            CSVRecord record = records.get(0);
            /* read */ boolean isNameSet = record.isSet("name");
            
            // Output the result
            System.out.println("Is 'name' set in the first record? " + isNameSet);

            // Additional processing to increase complexity
            ArrayList<String> cities = new ArrayList<>();
            for (CSVRecord rec : records) {
                cities.add(rec.get("city"));
            }
            
            // Print all cities
            for (String city : cities) {
                System.out.println("City: " + city);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}