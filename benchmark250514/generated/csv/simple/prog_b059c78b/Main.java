import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and configure it to ignore empty lines
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreEmptyLines();
            
            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\n\nJane,25,Los Angeles\n";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            
            // Iterate over the records and check if they are consistent
            for (CSVRecord record : parser) {
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Record is consistent: " + isConsistent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}