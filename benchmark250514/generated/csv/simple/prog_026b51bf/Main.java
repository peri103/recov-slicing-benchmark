import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        String csvData = "header1,header2\nvalue1,value2\n,,\nvalue3,value4";
        
        try {
            // Initialize CSVFormat and configure it to ignore empty lines
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            
            // Iterate through the records
            for (CSVRecord record : parser) {
                // Check if a specific column is set
                /* read */ boolean isSet = record.isSet("header1");
                System.out.println("Record isSet for 'header1': " + isSet);
            }
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}